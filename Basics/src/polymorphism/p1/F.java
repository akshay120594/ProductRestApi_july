package polymorphism.p1;

import java.util.Arrays;

public class F {

	// a is variable argument . we can pass any no of values for this argument
	
	public static void m1(String... a) {
			
		System.out.println(Arrays.toString(a));
		
		Arrays.sort(a);
		
		System.out.println(Arrays.toString(a));
	
	}

	public static void main(String[] args) {
		
		//F.m1(null);
		F.m1("JBK","JAVA","PUNE");
		//F.m1("April");
		//F.m1();
		
		
	}

}
