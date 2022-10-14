package arrayex;

public class CommonElements3 
{

		public static void main(String[] args) {
			

			int[] a = {1,7,3,6,1};
			int[] b = {1,4,3,2};
			
			
			for(int i=0;i<a.length;i++)
			{
				boolean isSearched=false;
				
				/* due to j<i , first element will not be searched in below loop*/
				
				for(int j=0;j<i;j++)
				{
					if(a[i]==a[j])
					{
						isSearched=true;
						break;
					}
				}
				
				if(!isSearched)
				{
					if(Utility.search(b,a[i]))
						System.out.println(a[i]);
				}
			}
		}
	
}
