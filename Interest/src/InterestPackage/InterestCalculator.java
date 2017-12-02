package InterestPackage;

import java.lang.Math;
import java.util.Scanner;


public class InterestCalculator {
	
	enum seasons {WINTER,SUMMER,FALL};
	enum DayWeek {SUNDAY,MONDAY};
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int integerNumber  = 1;
			int shortNumber =2;
			shortNumber =(short) integerNumber;
			System.out.println(shortNumber);
			int a = 7;
			int b = 2;
			int c =a/b;
			System.out.println(c);
			boolean next = (a/b ==3) ? true: false;
			System.out.println(next);
			if (c ==3)
			{
				System.out.println("It is 1");
			}
			else
			{
				System.out.println("It is not 1");
			}
			int d = a%b;
			System.out.println(d);
			d = ++d;
			System.out.println(d);
			d = --d;
			System.out.println(d);
			double principal;
			double rate;
			double interest;
			principal = 70000;
			seasons season;
			rate = 5.25;
			interest = (principal * rate) / 100; // Calculate interest
			System.out.print("Interest is: ");
			System.out.println(interest);
			int number = 100;
			System.out.println(Math.sqrt(number));
			System.out.println(Math.pow(2, 3));

			System.out.println("Random Number is: " + Math.random());
			System.out.println("Time in Milli Seconds: " + (System.currentTimeMillis() / (1000 * 60 * 60)));
			String myName = "Ramesh Babu";
			System.out.println("The Length of My Name:" + myName.length());
			System.out.println("The char at 5:" + myName.charAt(5));
			System.out.println("The Length of My Name:" + myName.substring(2, 2));
			System.out.println(myName.toLowerCase());
			System.out.println(myName.indexOf('a'));
			System.out.println("Current Season is " + seasons.WINTER);
			season = seasons.FALL;
			DayWeek dayofWeek;
			dayofWeek = DayWeek.MONDAY;
			System.out.println(dayofWeek);
			System.out.println(season);
			System.out.println("Please Enter the Number");

			/*Scanner scan = new Scanner(System.in);
			int newNumber = scan.nextInt();			
			System.out.println(newNumber);*/
			int formattedNumber = 12345;
			System.out.printf("%5d",formattedNumber);
			System.out.println("\n");
			System.out.println("Enter Your Name");
			String s ="";
			Scanner scannner1 = new Scanner(System.in);
			//s = scannner1.nextLine();
			/*while (scannner1.hasNext())
			{
				s = scannner1.nextLine();
			}*/
			
			//name = scannner1.next();
			double d1 = scannner1.nextDouble();
			System.out.println(d1);
			//System.out.println(s);
			
			scannner1.close();
			//scan.close();
					} catch (Exception ex) {
			System.out.println(ex.getMessage());			
		}

	}

}
