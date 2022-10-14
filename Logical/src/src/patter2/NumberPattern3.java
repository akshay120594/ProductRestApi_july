package patter2;

/*			3 2 1
 	1			1
 	2		  1 2
 	3		1 2 3
*/

public class NumberPattern3 {
	public static void main(String[] args) {
		
		int no=0;
		
		for(int i=1;i<=3;i++)
		{
			no=0;
			
			for(int j=3;j>=1;j--)
			{
				if(j>i)
					System.out.print(" ");
				else
				{
					
					System.out.print(++no);
				}
			}
			
			System.out.println();
		}
	
	}
}
