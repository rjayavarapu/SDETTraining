package oopspak;

public class LoanAccount implements IRate{

	@Override
	public void setRate() {
		// TODO Auto-generated method stub
		
		System.out.println("Rate set in LoanAccount");
		
	}

	@Override
	public void increateRate() {
		// TODO Auto-generated method stub

		System.out.println("Rate increased in LoanAccount");
	}
	
}
