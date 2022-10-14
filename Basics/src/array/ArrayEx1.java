package array;

import java.util.Arrays;

public class ArrayEx1 {

	public static void main(String[] args) {
		
		int[] a = new int[2];// a [0][0]
	
		System.out.println(a.toString());
		
		System.out.println(a.length);
		
		System.out.println(Arrays.toString(a));
		
		int   c;// variable declartion
		int[] b;// array declare
		
		c=20;
		b=new int[2];// array initializes // [0][0]
		
		System.out.println(Arrays.toString(b));
		
		b[0]=50;// array is updated
		
		System.out.println(Arrays.toString(b));
		
		
		int d=30;//variable is declared and initialized
		int[] e=new int[2];// array is declared and initialized 
		
		System.out.println(Arrays.toString(e));
		
		
	}
}
