package ArrayPackage;
import java.util.ArrayList;
public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList <Integer> myList = new ArrayList<Integer>(10);
		int i=1;
		while(i<100)
		{
			myList.add(i);
			i++;			
		}
		
		myList.remove(98);
		//myList.clear();
		myList.set(92, 100);
		for(Integer x:myList)
		{
			System.out.println(x);
		}
		
		System.out.println("Size is:" + myList.size());

	}

}
