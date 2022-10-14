package exception;

public class ThrowsDemo2 {
	
	// throws indicates caller of m1() should handle exception
	// throws is used to delegate exception handling responsibility to caller of method
	
	static void m1(String a) throws Exception
	{
		
			Class.forName(a).getConstructor().newInstance();
				
		
	}
	
	public static void main(String[] args)    {
			
		// Tomcat Server do not know name of Servlet class 
		// If we don't know class name at compile time , we can not use new and constructor 
		// to create object of that class . we must use newInstance()
		
		try
		{
			m1("exception.Employee");
		}
		catch(Exception e)
		{
			//System.out.println("please ensure that default constructor is written");
			e.printStackTrace();
		}
		
		System.out.println("All is well");
				
		
	}

}
