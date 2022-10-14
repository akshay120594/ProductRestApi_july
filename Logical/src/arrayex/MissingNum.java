package arrayex;

import java.util.Arrays;

public class MissingNum {
public static void main(String[] args) {
	int []j= {1,4,7,13,19};
	Arrays.sort(j);
	int diff=j[1]-j[0];
	for (int q=2;q<j.length-1;q++) {
		int w=j[q+1]-j[q];
		if (w<diff) {
			diff=w;
		}	
	}
	System.out.println(diff);
	System.out.print(j[0]+" ");
	for(int i=0;i<j.length-1;i++)
	{
			int sum=j[i]+diff;

			while (sum<j[i+1])
			{
				System.out.print(sum + " ");
				sum=sum+diff;
			}
			
			System.out.print(sum + " ");
	}

	}
}