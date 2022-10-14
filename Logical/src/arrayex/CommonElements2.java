package arrayex;

public class CommonElements2 
{

		public static void main(String[] args) {
			

			int[] a = {1,2,3,1};
			int[] b = {1,4,3};
			
			
			for(int i=0;i<a.length;i++)
			{
				if(Utility.search(b,a[i]))
					System.out.println(a[i]);
			}
		}
	
}
