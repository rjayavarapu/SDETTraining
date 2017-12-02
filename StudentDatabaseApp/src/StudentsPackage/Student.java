package StudentsPackage;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private static int courseCost = 600;
	private String courses = null;
	private int  balance = 0;
	private static int id =1000;
	//= new String["History", "Mathematics","English","Chemisty","Computer Science"];
	
	//constructor
	public Student()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Student FirstName");
		this.firstName = in.nextLine();
		System.out.println("Enter Student LastName");
		this.lastName = in.nextLine();
		System.out.println("1.Freshman\n2.SoftMore\nEnter Student Year");
		this.gradeYear = in.nextInt();
		setStudentID();
		System.out.println(this.firstName + this.lastName + this.gradeYear + this.studentID);
		in.close();
	}
	
	//Generate a ID
	private void setStudentID()
	{
		id++;
		//Grade level + ID
		studentID = gradeYear + "" + id;
	}
	//Enroll in courses
	public void enroll() {
		Scanner scan1;
		do
		{
			try
			{
				System.out.println("Enter  course to enroll - Q to Quit");
				scan1 = new Scanner(System.in);
				String course = scan1.nextLine();
				if (!course.equals("Q"))
				{
					courses = courses + "\n" + course;
					balance = balance + courseCost;
				}
				else break;
			}
			catch(Exception ex) {
				
			}
		} while (1!=0);
		
		System.out.println("Enrolled in courses" + courses);
		System.out.println("Balance of courses" + balance);
		scan1.close();

	}
	//View Balance
	public void viewBalance()
	{
		System.out.println("Your Balance is :" +balance);
	}
	
	//Make Payment
	
	public void PayTution()
	{
		try
			{
			viewBalance();
			System.out.println("Enter your payment");
			Scanner scan2 = new Scanner(System.in);
			int payment = scan2.nextInt();
			balance = balance - payment;
			scan2.close();
			System.out.println("Thank your for the payment" +payment);
			viewBalance();
		}
		catch(Exception ex)
		{
		}		
		
	}
	
	
	//Show info
	
	public String showInfo()
	{
		return "Name:" + firstName + lastName;
	}
	
}
