package polymorphism;

public class TestInheritance {
	
	public static void main(String[] args) {
		
		Child c = new Child();
		c.m2();
		c.m1();
		
		Parent p = new Child(); // p==>[m1() m2()] Child class object
		p.m1();
		
		p = new Parent();// p==> [m1()] Parent class object
		p.m1();
		
		// same reference can point to different object at different point of time
	}

}
