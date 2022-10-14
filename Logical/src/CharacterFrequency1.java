
/* Program to print frequency of each character in from String   */

public class CharacterFrequency1 {

	public static void main(String[] args) {

		String s="AaBbA";

		int[] a = new int[125];

		for(char ch :s.toCharArray())
		{
			a[ch]++;
		}
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=0)
				System.out.println((char)i + " has apperared " + a[i] + " times ");
		}
		
	}

}
