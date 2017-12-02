package ExceptionPackage;

public class ExceptionExample {

	public static int retInt()
	{
		int a= 100;

		try
		{

			System.exit(1);
			return a;
		}
		catch(ArithmeticException ex)
		{
			System.out.println(ex);
			return a;
		}
		finally
		{
			System.out.println("Finallay Called");
		}

		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int abc[] = new int[2];

		System.out.println(retInt());
		
	}

}
