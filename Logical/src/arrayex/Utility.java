package arrayex;

public class Utility 
{
	
		static boolean search(int[] b,int element)
		{
			boolean isFound=false;
			
			for(int j=0;j<b.length;j++)
			{
				if(element==b[j])
				{
					isFound=true;
					break;
					
				}
			}
			
			return isFound;
			
			
		}
			
		
	
}
