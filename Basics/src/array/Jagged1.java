package array;

import java.util.Arrays;

public class I {

	public static void main(String[] args) {
		
		int sum=0;
		
		int[][] a = new int[3][]; // In jagged array , no of rows are fixed , but no of columns are not fixed
		
		a[0] = new int[3];
		a[1] = new int[2];
		a[2] = new int[1];
		
		//  0 0  0  0
		//  1 0  0
		//  2 0
		//  Jagged Array
		 
		int no=1;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
			
				a[i][j]= no++;
			}
			
			
		}// for loop ends
		
		System.out.println(Arrays.deepToString(a));
	
	}
	
	
	/*     
	 	
	  			0  1  2===column index
	 a 		
	  		0	10 20 30
	  		1	40 50 60
	  		2	70 80 90
	  		
	  		row index
	  		
	 */

}
