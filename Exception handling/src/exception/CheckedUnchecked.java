package exception;

public class CheckedUnchecked 
{
	public static void main(String[] args)  {
		
		Class.forName("java.lang.String"); 
		
		// throws is used to delegate exception handling responsibility to caller of a method
		
		int no=Integer.parseInt("10"); // "10" String 10 parseInt will take String 10 and convert it into int 10
		System.out.println(no);
	
		//int a=Integer.parseInt("ten");
					
				try {
					Class.forName("java.lang.String"); // forName(String classname) It expect fully qualified name  means packagename.classname
				} catch (ClassNotFoundException e) {
					
					e.printStackTrace();
				}
			
				// checked exception - compile time exception - checked exception are checked at compile time 
			    // unchecked exception :- compiler do not check them
	}
}
