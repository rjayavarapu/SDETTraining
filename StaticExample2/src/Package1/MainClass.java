/**
 * 
 */
package Package1;

/**
 * @author rjayavar
 *
 */
public class MainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HelloClass.DoSomething();
		HelloClass hello1 = new HelloClass();
		hello1.DoSomethingElse();
		
		System.out.println(HelloClass.age);
		
		Student student1 = new Student();
		System.out.println(student1.getStudentCount());
		Student student2 = new Student();
		System.out.println(Student.NoofStudents);
		Student student3 = new Student();		
		System.out.println(Student.NoofStudents);

		System.out.println(student1.NoofStudents);

	}

}
