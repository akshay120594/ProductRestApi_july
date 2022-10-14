package patter2;

/*
 *  `0  1  2   3  4
1*2  1  @  2
2*2	 1  @  2   @  3
 	

*/

public class Pattern1 {

	
	public static void main(String[] args) {
		
		for(int i=1 ; i<=2;i++)
		{
			int num=1;
			
			for(int j=0;j<=i*2;j++)
			{
				if(j%2==0) {
					
					System.out.print(num);
					num=num+1;
				}
				else
					System.out.print('@');
					
			}
			
			
			System.out.println();
		}
	}
}
