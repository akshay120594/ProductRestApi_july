package array;

import java.util.Arrays;

public class PrimitiveArrayExample {

	public static void main(String[] args) {
							//  0  1
		int[] a=new int[2];//a [0][0]
		
		System.out.println(Arrays.toString(a));
		
		a[0]=10;
		a[1]=20;
		
		System.out.println(Arrays.toString(a));
	}
}
