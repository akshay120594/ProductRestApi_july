

import java.util.Scanner;

/* write a program to convert digit to word 
 * 
 * e.g. 240 - two four zero
 * 
 * */
public class DigitToWord1 {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		StringBuffer stringbuffer = new StringBuffer();
			
		String[]  numbers = {"zero","one","two","three","four","five","six","seven","eight","nine"};
				           //  0      1     2      3      4       5     6      7       8      9
		
		System.out.println("Enter number :-  ");
		int no=scanner.nextInt();//240
				
		String s=no+"";
		System.out.println(s.length());
		int divident=100;
		
			while(divident>=1)
			{
				int digit = no/divident;//0
				
				stringbuffer.append(numbers[digit] + " "); // two,four,zero,
				
				no=no%divident;//0
				
				divident=divident/10;//0
				
			}
			
			System.out.println(stringbuffer);
					
			
	}
}
