package arrayex;

public class CommonElements {

	public static void main(String[] args) {
		
		
		int[] a = {1,2,3};
		int[] b = {1,4,3};
		
		
		for(int i=0;i<a.length;i++)
		{
			/* searching particular number from array a in array b */
			
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					System.out.print(a[i] + " ");
					break;
				}
			}
			
			
		}
	}
}
