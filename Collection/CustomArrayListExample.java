
/* Program to create Custom ArrayList */

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayListExample {

	public static void main(String[] args) {
		
		int capacity=10; 
		
		Object[] a = new Object[capacity]; //  		
		int no=1;
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=no++;
			
		}
		
		System.out.println("Original Array size " + a.length);
		
		System.out.println("Original Array contents " + Arrays.toString(a));
		
		
		//a[10]="java";
		
		// when first array is full , new array will be created , which will have all
		// elements from original array and size of this new array will be twice of original array
		
		a=Arrays.copyOf(a, a.length*2);
			
		
		a[10]="java";
		a[11]="is";
		a[12]="easy";
		
		System.out.println("Updated Array size " + a.length);
		System.out.println("Updated Array contents " + Arrays.toString(a));
	
		int x=10;
		int y;
		y=x;
		
		int[] b= {10,20,30}; // b , c ==>[10,20,30] 
		int[] c= new int[b.length];
		
		//c=b;
		
		System.arraycopy(b, 0, c, 0,2);

		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(c));
		
		
		
		
	}
	
	
	
}
