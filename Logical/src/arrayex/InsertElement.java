package arrayex;

import java.util.Arrays;

public class InsertElement {

public static void main(String[] args) {
		
		int[] a= {10,20,30,40,50};
		
		int pos=3;
		int element=25;
		
		int[] b=new int[a.length+1];// created new array 
		int index;
		
		// read first 2 elements and added it into second array
		for(index=0;index<pos-1;index++)
		{
			b[index]=a[index];
		}
		
		// 3rd element is added into second array
		
		b[index]=element;
		index=index+1;
		int i=pos-1;
		
		for(;i<a.length;index++,i++)
		{
			b[index]=a[i];
			
		}
		
		
		System.out.println(Arrays.toString(b));
		
		
	}
}
