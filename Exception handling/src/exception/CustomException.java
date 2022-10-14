package exception;
//When JVM calls main() , JVM passes String[] as a argument
		// to main() . That String[] is empty .
		
//main(String[] args)
	//{
	//}

	// String[] args = {};
	// main(args)

public class CustomException 
{
	static void test() throws NullPointerException  // Unchecked Exception
	{
		
	}
	
// throws is used to delegate exception handling responsibility to caller of method
	
	static void check(int age) throws AgeNotValidException // Checked Exception
	{
		if(age<18)
			throw new AgeNotValidException(18-age); 
		// throw is used to raise/generate exception
		else
			System.out.println("You can vote");				
	}
	// check(12)
	public static void main(String[] args)  
	{
		 test();
		//check(30);
		
		
		System.out.println(args.length);

//	//  when checked exceptions are not handled then we get compile time error . checked exception handling is compulsory
		
		try 
		{
				check(16);
		} 
		
		// reference of parent class can not call child class members
	// e--->[ waitingYears=6 toString()] AgeNotValidException class object
		
		catch (AgeNotValidException e) 
		{
			
			System.out.println("You can vote after " + e.waitingYears + " years . till then wait and watch");
				
		}

		
		try
		{
			int a= Integer.parseInt("ten");//10
			System.out.println(a);
		}
		
		catch(NumberFormatException e)
		{
			System.out.println("Please pass valid string like \"10\" ");
		}
				
		
	    System.out.println("All is well");
	    
	}

}
