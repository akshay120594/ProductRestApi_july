package polymorphism;

public class OverloadingDemo {

	
	static void m1(Object o)
	{
		System.out.println("Object class");
	}
	
	static void m1(String o)
	{
		System.out.println("String class");
	}
	
	public static void main(String[] args) {
		
		m1(null);
		
		
	}
}
