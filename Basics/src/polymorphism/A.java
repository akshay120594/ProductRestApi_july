package polymorphism;

import java.util.ArrayList;

public class A {

	static void m1() { System.out.println("Parent class method");}
	
}

class B extends A
{
	static void m1() { System.out.println("Child class method");}
	
	public static void main(String[] args) {
		
		A.m1();
		B.m1();
		m1();
	}
}
