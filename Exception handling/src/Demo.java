import java.util.Scanner;

public class Demo {

	
	public static void main(String[] args) 
	{
	
		Scanner scanner=null;
			
		try
		{
			scanner=new Scanner(System.in);
			int a=scanner.nextInt();
			
			System.out.println(10/a);
			System.out.println("I will not execute");
			
		
			
		}
		
		// Exception e = new ArithmaticException();
		// e====>[ printStackTrace() ] ArithmaticException class object

		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		finally
		{
			scanner.close();
			System.out.println("always executes");
		}
		
		System.out.println("All is well");
		
		//System.out.println(a);
		
		
	
	}
}
