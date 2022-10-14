package polymorphism.p1;

import java.util.Arrays;

public class E {

	// a is variable argument . we can pass any no of values for this argument
	
	public static void main(int... a) {
			
		System.out.println(Arrays.toString(a));
	
	}

	public static void main(String[] args) {
		
		E.main(10,20);
		E.main(10,20,30);
		E.main(10,20,30,40);
		E.main();
	}

}
