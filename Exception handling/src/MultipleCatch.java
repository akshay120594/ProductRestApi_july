import java.util.Calendar;

/* variables are of 2 types:
 * 1) primitive variabe :- stores values
 *    int a =10;
 * 2) non-primitive variable / reference variable / pointer variable
 *    It stores address
 *    e.g. below s is a referece variable as it stores address of an object
 *    
 	  String s = new String("JBK");
 	  s(1000) ===> [JBK length()] String class object at address 1000
      s.length();
      
      String s =null;
      s.length();  // NullPointerException will occure here
      
      It means , reference variable is having null address into it . using 
      such null reference variable , if we call any variable / method , we get 
      NullPointerException.
 *  */
public class MultipleCatch {

	static int a;
	
	public static void main(String[] args) throws ClassNotFoundException 
	{
	
		// we delegate exception handling responsibility
		// using throws keyword
		
		// Checked Exceptions are those exception which must be handled
		// if we are not handling them compiler gives compile time error
		// e.g. ClassNotFoundException
		
		// unChecked Exceptions are those exception whose  handling
		// is not compulsory .e.g. NullPointerException
		
		// Exception handling is done by try and catch only and NOT by throws
		
		
		
		
		try
		{
			a=20;
			Integer.parseInt("ten");
			
			
			
			Class.forName("java.lang.String");				
			
			System.out.println(10/0);
		
			
			String s=null ; // = new String("JBK");
			s.length();
			System.out.println("I will not execute");
			
		}
			
				
		catch(NullPointerException e)
		{
			System.out.println("Make sure reference is not null");
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("follow mathemetics rule");
		}
		
//		// Exception e = new NullPointerException();
		
		catch(Exception e)
		{
					e.printStackTrace();
								
		}	
		finally
		{
			
			System.out.println("always executes");
		}
		
		System.out.println("All is well");
		
		System.out.println(a);
	
	}
}
