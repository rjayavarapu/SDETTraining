
public class SalaryCalcuator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String carrer;
		System.out.println("program is starting");
		carrer="Software Engineer";
		System.out.println("My Carrer is:" +carrer);
		carrer = "Web Developer";
		
		int hourPerWeek = 40;
		int weeksPerYear = 50;
		double hourlyRate = 42.450;
		double salary = hourPerWeek * weeksPerYear * hourlyRate;
		System.out.println("My Carrer as " + carrer + " at the rate of " + salary + " per year");
		

	}

}
