package array;

import java.util.Arrays;
import java.util.Scanner;

public class K {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int sum=0;
		
		int[][] a = new int[3][]; // In jagged array , no of rows are fixed , but no of columns are not fixed
		
		for(int i=0;i<3;i++)
		{
			System.out.println("Enter no of columns for " + (i+1) + " row ");
			int size=scanner.nextInt();
			
			a[i]=new int[size];
			
		}
		
		//  0 0  0  0
		//  1 0  0
		//  2 0
		//  Jagged Array
		 
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.println("Enter number ");
				a[i][j]= scanner.nextInt();
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
