import java.util.Scanner;

/* missing numbers :-  1,2,3,6,7 */

/* 1 , 4 , 1 , 2 , 7 , 16
 */
public class PairSquare2 {
	public static void main(String[] args) {

		int[] a = {1 , 4 , 1 , 2 , 7 , 16};
		
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]*a[i]==a[j] || a[j]*a[j]==a[i])
					System.out.println(a[i]+" " + a[j]);
			}
		}
		

	}
}
