
public class ErrorDemo 
{
	public static void main(String[] args) {
		
		//main(args); // recursion
		
		int a;
		
		try
		{
			System.out.println(10/0);
			a=10;// do not initialize local variable inside try
			
		}
		
		catch(Exception e)
		{
			
		}
		
		System.out.println(a);
		
	}
}
