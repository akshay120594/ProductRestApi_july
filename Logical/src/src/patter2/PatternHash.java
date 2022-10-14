package patter2;

public class PatternHash {

	public static void main(String[] args) {
		
		for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i%2==0)
					System.out.print("#");
				else
				{
					if(j==2)
					{
						System.out.print("#");
					}
					else
					{
						System.out.print(" ");
					}
				}
			}
			
			
			System.out.println();
		}
	}
}
