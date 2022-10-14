package primenumber;

import java.util.Scanner;

public class PrimeNumberRange {

	public static void main(String[] args) {

		
	int i;
	for(int no=1;no<=300;no++)
	{
		for(i=2;i<no;i++)
		{
			if(no%i==0)
			{
				
				break;
			}
			
		}// for loop end
		
		
		if(no==i)
			System.out.print(no+" ");
		
		if(no==1)
			System.out.println("");
		
	}	
	
		
	}// main ends
	
	
	
}
