package exception;

public class A {

	public static void main(String[] args) {
		
		try
		{
			System.out.println(10/0);
		}
		
		// finally do not handle exception
		
		finally
		{
			
		}
		
		System.out.println("hello");
	}
}
