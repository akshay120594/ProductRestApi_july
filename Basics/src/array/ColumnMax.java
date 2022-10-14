package array;
// 0  1  2
//10 20 30  - 1d array
//40 50 60  - 1d array
//70 80 90  - 1d array

public class ColumnMax {

	public static void main(String[] args) {
		// a[rowindex][columnindex]

		int[][] a= {{10,20,30},{40,50,60},{70,80,90}};
		int max;
		
		for(int i=0;i<3;i++)
		{
			max=a[0][i];//20
			
			for(int j=1;j<3;j++)
			{
				if(a[j][i]>max)
					max=a[j][i];
			}
			
			System.out.println("Maximum number from " + (i+1) + " column is " + max);
		}
		
		int[][] c= new int[3][2];
		System.out.println(c.length);
		
	}
}

