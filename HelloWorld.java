import java.util.Scanner;

/**
 * 
 */

/**
 * @author rjayavar
 *
 */
public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("-------Printing------");
		System.out.println("Ramesh Babu");
		System.out.println("-------Numbers------");
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println("The Addition of a and b is " + c);
		byte smallNumber = 108;
		System.out.println(smallNumber);
		short shortNumber= 121;
		System.out.println(shortNumber);
		long longNumber = 123456;
		System.out.println(longNumber);
		char character = 'c';
		System.out.println(character);
		double doubleNumber = 10.0;
		System.out.println(doubleNumber);		
		float floatNumber =(float) 20.0;
		System.out.println(floatNumber);

		System.out.println("-------Reading the Numbers------");
		Scanner scan = new Scanner(System.in);
		int readNumber = scan.nextInt();
		System.out.println("The Number read" + readNumber);
		scan.close();
		String s1 ="Apple";
		System.out.println("The Number read" + s1);

		System.out.println("-------If------");
		int firstNumber =15;
		if (firstNumber >10 && firstNumber <=15)
		{
		  System.out.println("The number is between 10 and 20");	
		}
		else
		{
			System.out.println("The number is not between 10 and 25");
		}

		System.out.println("-------Switch------");
		switch(firstNumber)
		{
		case 10:
			System.out.println("Number is 10");
		case 15:
			System.out.println("Number is 15");
		default:
			System.out.println("This is not a number");
		}

		System.out.println("-------String ------");
		String string1="Ramesh";
		String string2="Babu";
		System.out.println(string1 + string2);
		System.out.println(string1.toLowerCase());
		System.out.println(string1.toUpperCase());
		System.out.println(string1.replace('a', 'e'));
		System.out.println(string1.concat(string2));
		System.out.println(string1.indexOf('m'));
		System.out.println("-------While------");
		System.out.println((string1.length() + string2.length()));
		int i=1;
		while(i<=0)
		{
			i ++;
			System.out.println(i);
		}

		System.out.println("-------Do While------");
		do
		{
			System.out.println(i);
			i++;
		} while (i<0);
		

		System.out.println("-------Arrays------");	
		int [] integerArray = {1,2,3};
		for (i=1;i<=integerArray.length;i++)
		{
			System.out.println(i);
		}
		System.out.println(integerArray[2]);
		for (int element:integerArray)
		{
			System.out.println(element);
		}
		

	}
}