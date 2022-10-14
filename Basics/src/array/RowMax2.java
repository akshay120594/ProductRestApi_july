package array;
//    0  1  2
//0  10 20 30  - 1d array
//1  40 50 60  - 1d array
//2  70 80 90  - 1d array

public class RowMax2 {
	
	public static void main(String[] args) {
		
		int[][] a= {{10,20,30},{40,50,60},{70,80,90}};
		int max;
		
		for(int i=0;i<3;i++)
		{
			max=a[i][0];//90
			
			for(int j=1;j<3;j++)
			{
				if(a[i][j]>max)
					max=a[i][j];
			}
			
			System.out.println("Maximum number from " + (i+1) + " row is " + max);
		}
		
		int[][] c= new int[3][2];
		System.out.println(c.length);
		
		//             0           1          2
		int[][] d= {{10,20,30},{40,50,60},{70,80,90}};
		System.out.println(d.length);
		System.out.println(d.getClass().getName());
		
		System.out.println(d.length);
		System.out.println(d[0][2]);
	}
	
	
}

