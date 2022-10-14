
public class MethodsDemo2 {

	int c;
	
	int add(int a,int b) // a & b formal arguments
	{
		this.c=a+b; // this is a reference which points to current class object
		return this.c;
	}
	
	public static void main(String[] args) {
		
		MethodsDemo2 obj = new MethodsDemo2();
		
		// obj , this ==> [c=0] MethodsDemo2 class object
		// this is a reference . 
		
		int a=10;
		int b=20;
		
		obj.add(a,b); // a & b actual argument
		
		System.out.println(obj.c);
		
		// non-static - reference
		// static - class
	}
}
