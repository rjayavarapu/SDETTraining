package EmailApp;
import java.util.Scanner;

public class Email {

	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int mailboxCapacity = 500;
	private String alternateEmail;
	private int passwordDefaultLength = 5;
	private String email;
	private String companySuffix = "company.com";
	
	
	//Constructor
	public Email(String firstName,String lastName)
	{
		this.firstName = firstName;
		this.lastName  = lastName;
	//	System.out.println("Email Created:" + " " +  this.firstName + " " + this.lastName);
		//Call a method asking for department and return department
		this.department = setDepartment();
		//System.out.println("Department is:" + this.department);
		this.password = GenerateRandomPassword(passwordDefaultLength);		
		//System.out.println("Password Generated" + this.password);
		
		email = this.firstName.toLowerCase() + "." + this.lastName.toLowerCase() + "@" + this.department+ "." + this.companySuffix;
		//System.out.println(this.email);
		
	}
	
	//Ask for the department
	private String setDepartment()
	{
		int depChoice;
		String department="";
		System.out.print("EnterDepartment Codes:\n1 for sales\n2 for Development\n3 for Accounting\n0 for None\nEnter the Deaprtment\n");
		Scanner scan = new Scanner(System.in);
		depChoice = scan.nextInt();
		//scan.close();
		switch(depChoice)
		{
		case 1:
			department = "Sales";
			break;
		case 2:
			department="Development";
			break;
		case 3:
			department="Accounting";
			break;
		default:
			department="";
			break;			
		}
		return department;
		
	}
	
	//Generate the random password
	private String GenerateRandomPassword(int length)
	{
		String passwordSet ="ABCDEFGHIJK1234!@@$";
		char [] passwordGenerated = new char[length];
		//System.out.println(length);	
		//System.out.println(passwordSet.length());
		try
		{
		for(int i=0;i<=length;i++)
		{
			int rand = ((int)Math.random() * passwordSet.length() + 1);
			//System.out.println(rand);
			passwordGenerated[i] = passwordSet.charAt(rand);
		}
		}
		catch(Exception ex) {
			
			System.out.println(ex.getMessage());
		}
		return new String(passwordGenerated);
	}
	
	//Set mailbox capacity
	
	public void setMailBoxCapacity(int capacity)
	{
		this.mailboxCapacity = capacity;		
	}
	
	//Set alternate email
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}
	
	//Change the password
	public void changePassword(String newpassword)
	{
		this.password = newpassword;
	}
	public int getMailBoxCapacity()
	{		
		return this.mailboxCapacity;
	}
	public String getAlternateEmail()
	{		
		return this.alternateEmail;
	}
	public String getPassword() {
		return this.getPassword();
	}
	
	public String showInfo()
	{
		return  "Employee Details" + "\n" + "Display Name:" + this.firstName + " " 
				+ this.lastName + "\n" + "Company Email:" + this.email + "\nMail Box Capacity:"  
				+ this.mailboxCapacity + "MB" + "\nPassword:" + this.password;
	}
	
}
