
public class IntegerArrayOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] intArray = new int[100];
		for(int i =0; i<intArray.length;i++)
		{
			intArray[i] = i;	
		}
		average(intArray);
		max(intArray);
		min(intArray);

	}
	
	public static void average(int[] array1)
	{
		int sum = 0;
		for(int i =0; i<array1.length;i++)
		{
			sum = sum +array1[i];	
		}

		double average = sum / array1.length;
		//System.out.println(sum);
		System.out.println("Average of 100 Numbers is" + average);

	}
	
	public static void max(int[] array1)
	{
		int max = 0;
		for(int i =0; i<array1.length;i++)
		{
			if (array1[i] > max)
			{
				max = array1[i]; 
			}
		}
		System.out.println("Maximum Number is: " + max);
	}
	
	public static void min(int[] array1)
	{
		int min = 0;
		for(int i =0; i<array1.length;i++)
		{
			if (array1[i] < min)
			{
				min = array1[i]; 
			}
		}
		System.out.println("Minimum Number is:" + min);
	}
}
