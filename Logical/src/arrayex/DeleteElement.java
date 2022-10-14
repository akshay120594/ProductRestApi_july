package arrayex;

import java.util.Arrays;

/*
 int[]  marks={10,20,30,40};
 *  */
public class DeleteElement {

	
	public static void main(String[] args) {
		
		        // 0 1  2  3  4 
		int[] a= {10,20,30,40,50};// 10 20 40 50
		
		int pos=3;
		
		/*  this for loop will delete element */
		
		for(int i=pos-1;i<a.length-1;i++)
		{
			a[i]=a[i+1];
		}
		
		System.out.println(Arrays.toString(a));
	
		/* this for loop will print elements . observe that last element from an array is not printed */
		
		for(int i=0;i<a.length-1;i++)
		{
			System.out.print(a[i]+",");
		}
	}
}
