
/* Program to print frequency of each digit in given number   */

public class NumberFrequency {

	public static void main(String[] args) {


		int index=0;
		
		int number=121;

		int[] a = new int[10];

		while(number!=0)
		{
				index=number%10;
				a[index]=a[index]+1;
				number=number/10;
		}
		
		
		for(index=0;index<a.length;index++)
		{
			if(a[index]!=0)
			{
				System.out.println(index + " has apperaed " + a[index] + " times");
			}
		}
		
		
	}

}
