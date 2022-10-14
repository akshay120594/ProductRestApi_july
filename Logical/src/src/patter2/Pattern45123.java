package patter2;

public class Pattern45123 {
public static void main(String[] args) {
	for(char c='A';c<='E';c++)
	{
		// s='A';
		
		int t=1;
		
		for(char j=c,s='A' ;j<='E';j++,s++)
		{
			if(c%2==0)
			{
				System.out.print(t++);
			}
			else
			{
				System.out.print(s);
			}
		}
		System.out.println();
	}
}
}
