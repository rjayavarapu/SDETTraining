class Employee{
 float salary=40000;
}

public class InheritExample extends Employee{
int bonus=10000;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InheritExample i = new InheritExample();
		System.out.println(i.bonus);
		System.out.println(i.salary);
	}

}
