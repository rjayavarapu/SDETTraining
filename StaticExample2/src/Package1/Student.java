package Package1;

public class Student {

	String name;
	int age;
	static int NoofStudents = 0;
	
	Student()
	{
		NoofStudents++;		
	}
	public int getStudentCount()
	{		
		return NoofStudents;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
