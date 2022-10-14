import java.util.Arrays;

/* to run this program
 * 1) click run menu
 * 2) select run configuration
 * 3) select arguments tab'
 * 4) in program arguments section write
 *        10 20
 * 
 *  */
public class MainCalling {

	/* main method can also be overloaded . But JVM calls main(String[] args )  . other method we need to call */
	
	public static void main(int[] a)
	{
		for(int number : a)
		{
			System.out.println(number);
		}
	}
	
	public static void main(String[] args) 
	{

		System.out.println(args.length);
		// JVM creates class for our array .
		// But JVM do not override toString() of Object class
		// Hence when we print array , we get classname@hashCode
		
		System.out.println(args);
		System.out.println(Arrays.toString(args)); // toString() of Arrays gives us content of array
		
		//                   0     1
		// String[] args = {"10","20"};
		// MainCalling.main(args)
		
		
		int a= Integer.parseInt(args[0]);
		int b= Integer.parseInt(args[1]);
		
		System.out.println(a+b);
		
		
		
		int[] m = {10,20};
		main(m);
	}
}
