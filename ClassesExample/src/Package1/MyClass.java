package Package1;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Student student = new Student();
			student.setAge(10);
			student.setName("Ramesh Babu1");
			student.setId(1000);
			System.out.println(student.age);
			Student student1 = new Student();
			student.setAge(20);;
			student1.setName("Ramesh Babu");
			student1.setId(2000);
			System.out.println(student.getId());
			Cube myCube = new Cube();
			System.out.println(myCube.getCubeVolume());
			Cube myCube1 = new Cube(20,20,20);
			System.out.println(myCube1.getCubeVolume());
			int c = add(10,20);
			float d = add((float)10.0,(float)20.0);
			System.out.println(c);
			System.out.println(d);
	}
	
	public static int add(int a, int b)
	{
		return(a+b);
	}
	
	public static float add(float a, float b)
	{
		return(a+b);
	}
}
