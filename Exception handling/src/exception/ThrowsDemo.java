package exception;

public class ThrowsDemo {
	
	// throws indicates caller of m1() should handle exception
	// throws is used to delegate exception handling responsibility to caller of method
	
	static void m1(String a) throws NumberFormatException
	{
		
			System.out.println(Integer.parseInt(a));
		
	}
	
	public static void main(String[] args) throws NumberFormatException {
		
		m1("ttt");
		
		System.out.println("All is well");
		
		
		
	}

}
