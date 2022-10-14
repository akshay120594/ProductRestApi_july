package newfeatures;

/* 
   class System
	{
		public static final InputStream in ;
		public static final PrintStream out ;
	}

	in and out are static variables , hence they are accessed using class name

 */

// static variables and methods can be imported using import static and then we can access them WITHOUT using class names

import static java.lang.System.out;
import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.lang.Math.abs; //  // using * we imported all static members from Math class   import static java.lang.Math.*

public class StaticImportExample 
{

	public static void main(String[] args) 
	{
		
		out.println("Hello World");
		abs(-10);
		max(10, 20);
		min(10, 20);
		
		
	}
}
