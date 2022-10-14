
public class FibSeries2 {

	public static void main(String[] args) {

		// 0 1 1 2 3 
		int no1=0,no2=1,sum=0;
		
		
		for(int i=1;i<=5;i++)
		{
			System.out.print(sum+" ");
				
				
			no1=no2;
			no2=sum;
			
			
			sum=no1+no2;
			
				
		}

	}

}
