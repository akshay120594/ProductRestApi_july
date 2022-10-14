
public class MethodsDemo {

	void add(int a,int b) // a & b formal arguments
	{
		int c;
		c=a+b;
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		
		MethodsDemo obj = new MethodsDemo();
		
		int a=10;
		int b=20;
		
		obj.add(a,b); // a & b actual argument
		
		System.out.println("End of program");
	}
}
