

import java.util.Scanner;

/* write a program to convert digit to word 
 * 
 * e.g. 240 - two four zero
 * 
 * */
public class DigitToWord2 {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		StringBuffer stringbuffer = new StringBuffer();
			
		String[]  numbers = {"zero","one","two","three","four","five","six","seven","eight","nine"};
				           //  0      1     2      3      4       5     6      7       8      9
		
		System.out.println("Enter number :-  ");
		int no=scanner.nextInt();//24
					
			while(no!=0)
			{
				int digit = no%10;// 2
				
				stringbuffer.append(numbers[digit] + ","); // zero,four,two,
				
				no=no/10;//0

			}
			
			System.out.println(stringbuffer);
		
			
			String s = stringbuffer.toString();// convert it into string
			
			String[] words=s.split(","); // words [zero][four][two] 
			
			for(int index=words.length-1;index>=0;index--)
				System.out.print(words[index] + " ");
				
				
			
	}
}
