package primenumber;

import java.util.Scanner;

public class PrimeNumberTest {

	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number :- ");
		int no=sc.nextInt();
		
		int i;
		
		for(i=2;i<no;i++)
		{
			if(no%i==0)
			{
				System.out.println("Not prime");
				break;
			}
			
		}// for loop end
		
		
		if(no==i)
			System.out.println("prime number");
		
		if(no==1)
			System.out.println("1 is NOT prime number");
		
		
		main(args); // calling main() recursively
		
	}// main ends
}
