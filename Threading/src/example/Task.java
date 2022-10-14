package example;

import java.util.Scanner;

public class Task 
{
	int no,square;
		
	public  void calculate()
	{
		Scanner scanner = new Scanner(System.in);
				
		synchronized (this) 
		{
			System.out.println("Enter number  :-  ");
			no=scanner.nextInt();
			square = no*no;
			System.out.println(Thread.currentThread().getName() + " square of " + no + " is " + square);
			
		}
			
		
		
		
		System.out.println();
		
		//scanner.close();
	
	}

}


/*

 Enter number  :-  
Enter number  :-  
3
2
 square of 3 is 9
 square of 3 is 16
 */
 
