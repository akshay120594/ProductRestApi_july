
public class MethodsDemo4 {

	
	int add(int a,int b) 
	{
		int c=a+b; 
		return c;
	}
		
	public static void main(String[] args) {
		
		MethodsDemo4 obj = new MethodsDemo4();
		int a=10;
		int b=20;
		
		int ans = obj.add(a,b);
		
		System.out.println(ans);
		
		// non-static - reference
		// static - class
	}
}
