package arrayex;

import java.util.Arrays;

public class JaggedArrayEx {

	
	public static void main(String[] args) {
		
		int[][] a=new int[2][];
		System.out.println(Arrays.deepToString(a));
		
		a[0]=new int[2];
		a[1]=new int[3];
		
		System.out.println(Arrays.deepToString(a));
		
		String s=new String("kiranacademy");
		
		System.out.println(s);
		System.out.println(s.toString());
	}
}
