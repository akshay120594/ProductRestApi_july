package polymorphism.p1;

public class A {

	void m1(int a)
	{
		System.out.println("A class method");
	}
}

class B extends A
{
	
	void m1(int a,int b)
	{
		System.out.println("B class method");
	}
	
	public static void main(String[] args) {
		
		B obj = new B();
		obj.m1(10);
		obj.m1(10, 20);
	}
}
