import java.util.Scanner;

/* missing numbers :-  1,2,3,6,7 */
public class PairSquare {
	public static void main(String[] args) {

		int[] a = {1,2,3,1,4,7};
		
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]*a[i]==a[j])
					System.out.println(a[i]+" " + a[j]);
			}
		}
		

	}
}
