package patternex;

public class NumberPattern1 {

	public static void main(String[] args) {
		
		for(int i=3;i>0;--i)
		{
			int k=1;
			for(int j=0;j<i;j++)
			{
				System.out.print(k+" ");
				k++;
			}
			System.out.println("");
		}


	}

}
