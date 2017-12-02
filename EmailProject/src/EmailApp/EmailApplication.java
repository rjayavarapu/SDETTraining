package EmailApp;

public class EmailApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Email email1 = new Email("RameshBabu", "Jayavarapu");
		//email1.changePassword("kla");
		//email1.setAlternateEmail("ramesh.ramesh@k.com");
		//email1.setMailBoxCapacity(600);		
		//System.out.println(email1.getAlternateEmail());
		
		System.out.println(email1.showInfo());
	}

}
