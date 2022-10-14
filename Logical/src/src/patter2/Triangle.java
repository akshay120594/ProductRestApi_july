package patter2;

public class Triangle {
public static void main(String[] args) {
	for(int i=5;i>=1;i--)
	{
		int t=1;
		char c='A';
		
		for(int j=1;j<=i;j++)
		{
			if(i%2==0)
			{
				System.out.print(j);
			}
			else
			{
				System.out.print(c);
				c++;
			}
		}
		System.out.println();
	}
}
}
