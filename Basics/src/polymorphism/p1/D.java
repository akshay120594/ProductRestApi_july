package polymorphism.p1;

import java.util.Arrays;

public class D {

	public static void main(int[] a) {
			
		System.out.println(Arrays.toString(a));
	
	}

	public static void main(String[] args) {
		
		System.out.println("Main method with String array is called automatically by JVM .");
		System.out.println(args.length);// Array is empty . No elements
		System.out.println(args[0]);
		int[] a= {10,20,30};
		C.main(a);

	}

}
