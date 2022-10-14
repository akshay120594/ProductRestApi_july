package exception;

public class NestedTry 
{
	public static void main(String[] args) {
		
		try
		{
			System.out.println(10/0);
			
			try
			{
				System.out.println(10/0);
				
			}
			
			catch(Exception e) 
			{
				System.out.println("inner catch");
			}
			
		}// outer try
		
		catch(Exception e)
		{
			System.out.println("outer catch");
		}
		
		System.out.println();
		
	
	
		
	}
}
