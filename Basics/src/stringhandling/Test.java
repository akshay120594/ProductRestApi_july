package stringhandling;

public class Test {
	
	static String Myconcat()
	{
		
		// String s1="JBK";
		
		String s1=new String("JBK");
		
		return s1;
		
		
	}

	
	public static void main(String[] args) {
		
		String s1="JBK";
		
		String s = Myconcat();

		System.out.println(s==s1);// addresses are compared
		
		System.out.println(s1.equals(s));// contents are compared 
		
		// equals() of Object class is overridden inside String class
		
		
	} 
	
	
}
