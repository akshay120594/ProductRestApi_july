package patter2;

/* Program to display prime factors of number */

public class PrimeFactors {

// 2 3 4 6	
	public static void main(String[] args) {
		
		int num=12;
	
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				if(isPrime(i))
						System.out.println(i);
			}
				
		}
		
		
	}//main ends
	
	
	//4
	static boolean isPrime(int num)
	{
		
		
		boolean result=true;
		
		int i;
		
		for(i=2;i<num;i++)
		{
			if(num % i == 0)
			{
				result=false;
				break;
			}
		}
		
		
			return result;
		
		
	}
	
}//class ends
