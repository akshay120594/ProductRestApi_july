package exception;

public class FinallyReturnExample {

	public static void main(String[] args) {
		
		int a=10;
		
		try
		{
			System.out.println("Hello");
			//return;
			System.out.println(10/0);
			System.exit(0);
		}
		
		catch(Exception e)
		{
			return;
			
			
		}
		
		
		finally
		{
		
			System.out.println("finally");
		}
	}
}
