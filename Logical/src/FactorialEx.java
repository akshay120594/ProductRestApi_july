import java.util.Scanner;

public class FactorialEx {

	public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter a number :-  ");
			int no=sc.nextInt();
						
			long fact=1;
			
			for(int number=1;number<=no;number++)
			{
				fact=fact*number;
				
			}
			
			System.out.println("factorial of " + no + " is " + fact);

	}

}
