
public class MyFirstMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printingMethod("YouTube");		
		printingMethod("Yahoo");
		int c = addTwoNumbers(5,10);
		System.out.println(c);
		
	}
	
	public static void printingMethod(String name)
	{
		
		System.out.println("Hello" + name);
	}
	
	public static int addTwoNumbers(int a,int b)
	{
		return (a+b);
	}

}
