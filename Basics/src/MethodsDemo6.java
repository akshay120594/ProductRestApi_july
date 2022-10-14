public class MethodsDemo6 
{
	String getString() 
	{
		
		// s===> [JBK length()] String class object 
		
		return new String("JBK");
	}
	
	public static void main(String[] args) {
		
		MethodsDemo6 obj=new MethodsDemo6();
			
		String s = obj.getString();  
		
		// s(1000) ===> [JBK length()] String class object at address 1000
		
		int len = s.length();
	
		System.out.println(len*len);
		
		
	}
}
