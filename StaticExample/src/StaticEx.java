
public class StaticEx {
	
	int id;
	String name;
	static String college = "ITS";		
	StaticEx(int n, String name)
	{
		this.id = n;
		this.name = name;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticEx s1 = new StaticEx(1,"ramesh");
		System.out.println(s1.college);
		StaticEx s2 = new StaticEx(1,"ramesh");
		System.out.println(s2.college);
}
}