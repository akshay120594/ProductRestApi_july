
public class NullPointerExceptionExample 
{
	// s is global variable . If not initialized , they will get initialized automatically
	// reference variable default value is null.
	
	//static String s ; // reference variable . It is also global variable .
	
	static String s = "JBK";   // s--->[JBK length(),charAt()] String class object
	
	public static void main(String[] args) 
	{
		//s=new String("kiranacademy");
		
		int len=s.length();
		
		System.out.println("length is " + len);
		
		System.out.println("All is  well");
	}
}
