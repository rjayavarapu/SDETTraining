
public class FibonncciApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fib(0));
		System.out.println(fib(1));
		System.out.println(fib(2));
		System.out.println(fib(5));
	}

	public static int fib(int n)
	{
		
		if (n == 0)
		{
			return 0;
		}
		else if (n==1)
		{
			return 1;
		}
		else
		{
			return(fib(n-1) + fib(n-2));
		}
	}
}
