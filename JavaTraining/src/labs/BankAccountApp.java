package labs;

public class BankAccountApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankAccount bankAccount1 = new BankAccount("1231231234", 1000);
		bankAccount1.setName("Ramesh");
		System.out.println(bankAccount1.getName());	
		bankAccount1.depoist(2000);
		bankAccount1.payBill(1000);
		bankAccount1.accureInterest();
		System.out.println(bankAccount1.toString());

		//BankAccount bankAccount2 = new BankAccount("1331231234");

	//	BankAccount bankAccount3 = new BankAccount("1431231234");

	}

}

class BankAccount implements IInterest
{
	
	//Properties of BankAccount
	private static int ID = 1001;
	private String accountNumber; //id + random 2 digit number + first 2 of SSN
	private static final String routingNumber = "0045400657";
	private String name;
	private String SSN;
	private double balance;
	
	public BankAccount(String SSN, double deposit)
	{
		//System.out.println("Account Created");	
		//System.out.println(ID);		
		setAccountNumber(SSN);
		ID++;
		this.balance = deposit;
	}
	
	private void setAccountNumber(String SSN)
	{
		int randomNumber = (int) (Math.random() *10);
		accountNumber = ID + "" + randomNumber + SSN.subSequence(0, 2);
		System.out.println("Your Account Number" + accountNumber);
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return this.name;
	}
		
	public void payBill( double amount)
	{
		balance = balance - amount;
		showBalance();
	}
	public void depoist( double amount)
	{
		balance = balance + amount;
		showBalance();
	}
	
	public void showBalance()
	{
		System.out.println(this.balance);
	}

	@Override
	public void accureInterest() {
		// TODO Auto-generated method stub
		balance  = balance + (rate/100);
		showBalance();
	}
	@Override
	public String toString()
	{
		return "Name" +name;
	}
	
}
