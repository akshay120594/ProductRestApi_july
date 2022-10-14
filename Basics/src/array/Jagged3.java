package array;

import java.util.Arrays;

public class NoColumns {

	public static void main(String[] args) {
		
		// noofcolumns are not specified . such array is called jagged array
				
				int[][] twod = new int[3][];

				for(int[]  arr : twod)
				{
					System.out.println(arr);
				}
				
				twod[0]=new int[2];
				twod[1]=new int[4];
				twod[2]=new int[2];
				
				System.out.println(Arrays.deepToString(twod));
				
				System.out.println(twod[0][1]);
				
				int[] t=new int[8];
				String s=new String("KiranAcademy");
				new String("JBK").length();
				
				

	}
}
