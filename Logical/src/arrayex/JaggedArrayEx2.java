package arrayex;

import java.util.Arrays;
import java.util.Scanner;

public class JaggedArrayEx2 {

	
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		int[][] a=new int[2][];
		int columnsize;
		
		for(int i=0;i<2;i++)
		{
			System.out.println("Enter column size for " + (i+1) + " row ");
			columnsize=scanner.nextInt();
			a[i]=new int[columnsize];
		}
		
		System.out.println(Arrays.deepToString(a));
		
//		a[0]=new int[2];
//		a[1]=new int[3];
		
		for(int i=0;i<2;i++)
		{
				System.out.println("Enter " + a[i].length + " values");
				
				for(int j=0;j<a[i].length;j++)
				{
					System.out.println("Enter number :- ");
					a[i][j]=scanner.nextInt();
				}
					
		}
		
		System.out.println(Arrays.deepToString(a));
	}
}
