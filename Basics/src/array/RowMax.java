package array;

//10 20 30  - 1d array
//40 50 60  - 1d array
//70 80 90  - 1d array

public class RowMax {

	public static void main(String[] args) {
		//                 0           1           2
		int[][] twod= {{10,20,30},{40,50,60},{70,80,90}};
		
		for(int[] a:twod)
		{
			System.out.print(a[0] + " " + a[1] + " " + a[2]);
			System.out.println();
		}
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
				System.out.print(twod[i][j]+" ");
			System.out.println();
		}
		
		for(int[] a:twod)
		{
			System.out.println(giveMax(a));
		}
		
		for(int i=0;i<3;i++)
		{
			System.out.println(giveMax(twod[i]));
		}
	}
	
	static int giveMax(int[] a)
	{
		int max=0;
	
		for(int element : a)
		{
			if(element>max)
			{
				max=element;
						
			}
		}
				
		return max;
	}
}

