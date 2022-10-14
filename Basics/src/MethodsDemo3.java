
public class MethodsDemo3 {

	int c;
	
	int add(int a,int b) // a & b formal arguments
	{
		this.c=a+b; // this is a reference which points to current class object
		return this.c;
	}
	
	int sub(int a,int b) // a & b formal arguments
	{
		this.c=a-b; // this is a reference which points to current class object
		return this.c;
	}
	
	
	public static void main(String[] args) {
		
		MethodsDemo3 obj = new MethodsDemo3();
	
		int a=10;
		int b=20;
		
		obj.add(a,b); 
		System.out.println(obj.c);
		
		
		obj.sub(a,b); 
		System.out.println(obj.c);
		
		// non-static - reference
		// static - class
	}
}
