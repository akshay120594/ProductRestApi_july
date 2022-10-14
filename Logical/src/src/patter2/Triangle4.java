package patter2;

public class Triangle4 {
	
	static boolean isAlpha(int ascii)
	{
		if(ascii>=65 && ascii<=90 || ascii>=97 && ascii<=122)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
public static void main(String[] args) {
	
	for(int i=5;i>=1;i--)
	{
		
		int c;
			
		if(i%2==0)
			c=1;
		else {
			c='A';
			
		}
		
		for(int j=1;j<=i;j++)
		{
			if(isAlpha(c))
				System.out.print((char)c);
			else
				System.out.print(c);
			c++;
			
		}
		System.out.println();
	}
}
}
