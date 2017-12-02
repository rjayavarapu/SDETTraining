package Shapes;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Triangle tri = new Triangle();
		Rectangle rec = new Rectangle();
		rec.set_Values(10, 20);
		System.out.println("Area of rectangle =" +  rec.area());
		tri.set_Values(10, 20);
		System.out.println("Area of triangle =" + tri.area());

	}

}
