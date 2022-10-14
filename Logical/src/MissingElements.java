import java.util.Arrays;

/* Missing elements from an array */

public class MissingElements {

	public static void main(String[] args) {

		int[] a={1,5,9,11};
		
		Arrays.sort(a);//1  4 7 9

		System.out.println(Arrays.toString(a));
				
		//System.out.print(a[0]+" ");
		
		for(int i=0;i<a.length-1;i++)
		{
				int sum=a[i]+1;

				while (sum<a[i+1])
				{
					System.out.print(sum + " ");
					sum=sum+1;
				}
				
				//System.out.print(sum + " ");
		}
	
	}

}
