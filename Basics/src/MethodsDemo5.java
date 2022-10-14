
public class MethodsDemo5 {

	int c=30;
	
	int add(int a,int b) 
	{
		c=a+b; 
		return c;
	}
		
	public static void main(String[] args) {
		
		MethodsDemo5 obj = new MethodsDemo5();
		int a=1;
		int b=2;
		
		System.out.println("Before calling " + obj.c);
		
		obj.add(a,b);
		
		System.out.println("after calling " + obj.c);
		
		// non-static - reference
		// static - class
	}
}
