
public class FibSeries {

	public static void main(String[] args) {

		int no1=0,no2=1,sum=0;
		
		
		System.out.print(no1 + " " + no2+" ");
		
		for(int i=1;i<=3;i++)
		{
			sum=no1+no2;
			
			System.out.print(sum+" ");

			no1=no2;
			no2=sum;
			
		}

	}

}
