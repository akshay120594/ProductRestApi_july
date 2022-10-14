package patter2;

/*			1 2 3
 	3	    1 2 3
 	2		1 2
 	1		1
*/

public class NumberPattern5 {

	
	public static void main(String[] args) {
		
		for(int i=3;i>=1;i--)
		{
			
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			
			System.out.println();
		}
	
	}
}
