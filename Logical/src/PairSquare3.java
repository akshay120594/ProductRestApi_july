import java.util.Scanner;

/* missing numbers :-  1,2,3,6,7 */

/* 1 , 4 , 1 , 2 , 7 , 16
 */
public class PairSquare3 {
	public static void main(String[] args) {

		int[] a = {1 , 4 , 1 , 2 , 7 , 16};
		
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[i]*a[i]==a[j])
				{
					System.out.println(a[i]+" " + a[j]);
					break;
				}
			}
		}
		

	}
}
