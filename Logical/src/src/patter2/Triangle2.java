package patter2;

public class Triangle2 {
public static void main(String[] args) {
	for(int i=5;i>=1;i--)
	{
		
		int c;
		boolean flag=false;
		
		if(i%2==0)
			c=1;
		else {
			c='A';
			flag=true;
		}
		
		for(int j=1;j<=i;j++)
		{
			if(flag)
				System.out.print((char)c);
			else
				System.out.print(c);
			c++;
			
		}
		System.out.println();
	}
}
}
