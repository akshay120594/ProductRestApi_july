package primenumber;

import java.util.Scanner;

public class PrimeFactors {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number :- ");
		int no=sc.nextInt();
		
		for(int i=1;i<=8;i++)
		{
			if(no%i==0)
			{
				if(PrimeNumberFunction.isPrime(i))
					System.out.println(i);
								
			}
			
		}
		
		
	}
}
