package array;

import java.util.Arrays;

public class TwoDimensionalEx {

	
	public static void main(String[] args) {
		
		int[][] a=new int[2][2];
		
		System.out.println(Arrays.deepToString(a));
		
		a[0][1]=30;
		
		System.out.println(Arrays.deepToString(a));
		
		
		System.out.println(Arrays.toString(a[0]));
		
		System.out.println(Arrays.toString(a[1]));
		
	}
}
