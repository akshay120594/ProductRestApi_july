import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		
		boolean m=A.isPrime(5);
		System.out.println(m);
		
		System.out.println(isPrime(5));
		System.out.println(isPrime(6));
		
		
	}
	
	
	static boolean isPrime(int no)
	{
		if(no==1)
			return false;
		
		boolean answer=true;
		
		for(int i=2;i<no;i++)
		{
			if(no%i==0)
			{
				answer=false;
				break;
			}
		}
		
		return answer;
	}

}
