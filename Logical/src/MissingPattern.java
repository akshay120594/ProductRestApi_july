
public class MissingPattern {

	public static void main(String[] args) {
		
		int[] a ={1,9,13,21};

		int diff=a[1]-a[0];

		for(int i=1;i<a.length-1;i++)
		{
			int next=a[i]+diff;

			while(next<a[i+1])
			{
				System.out.println(next);
				next=next+diff;
			}
		}

	}

}
