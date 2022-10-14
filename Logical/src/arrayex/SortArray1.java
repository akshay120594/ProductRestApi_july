package arrayex;

import java.util.Arrays;

public class SortArray1 {

	public static void main(String[] args) {
		
		int[] a= {4,3,2,1,12,10};

		
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
						int temp;
						temp=a[i];
						a[i]=a[j];
						a[j]=temp;
				}
			}
		}
		
		
		System.out.println(Arrays.toString(a));
	}

}
