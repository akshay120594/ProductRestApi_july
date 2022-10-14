package pattern;

public class PyramidPattern3 {
	
	public static void main(String[] args) {
		
		for(int i=1;i<=3;i++)
		{
			for(int j=3;j>=1;j--)
			{
				if(j<=i)
					System.out.print("* ");
				else
					System.out.print("  ");// give 2 spaces
			}
			
			for(int k=i;k>1;k--)
				System.out.print("* ");
			
			System.out.println();
		}
		
	
		
		for(int i=1;i<=2;i++)
		{
			for(int j=1;j<=3;j++)
			{
				if(j>i)
					System.out.print("* ");
				else
					System.out.print("  ");// give 2 spaces
			}
			
			for(int k=1;k<=2-i;k++)
				System.out.print("* ");
			
			System.out.println();
		}
	
	}

}

