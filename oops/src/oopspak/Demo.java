package oopspak;

class Person
{
	String name;
	String email;
	String phone;
	
	void walk()
	{
		System.out.println(name + "is walking");
	}
	void eat()
	{
		System.out.println(name + "is eat");
	}
	void sleep()
	{

		System.out.println(name +"is sleeping");
		
	}
	
}
public class Demo {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.name ="Ramesh Babu";
		p1.email ="rjayavarapu@gmail.com";
		p1.phone="9259635002";
		p1.eat();
		p1.walk();
		p1.sleep();
		
	}
}
