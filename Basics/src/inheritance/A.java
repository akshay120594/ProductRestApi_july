package inheritance;

public class A {

	static void m1()
	{
		System.out.println("A class's static method");
	}
	
}// class A ends

class B extends A
{
	public static void main(String[] args) {
		
		m1();
	}
}

