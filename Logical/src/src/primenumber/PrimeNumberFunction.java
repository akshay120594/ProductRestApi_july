package primenumber;

import java.util.Scanner;

public class PrimeNumberFunction {

	public static void main(String[] args) {

	System.out.println(isPrime(1));
	System.out.println(isPrime(2));
	System.out.println(isPrime(3));
	System.out.println(isPrime(4));
		
	}// main ends
	
	
	public static boolean isPrime(int no)
	{
		    
			int i;
		
			for(i=2;i<no;i++)
			{
				if(no%i==0)
				{
					
					break;
				}
				
			}// for loop end
			
			if(no==1)
				return false;
			
			if(no==i)
				return true;
			else 
				return false;
			
			
		
	}
	
}
