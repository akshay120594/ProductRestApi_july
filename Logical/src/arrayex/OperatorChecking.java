package arrayex;

public class OperatorChecking {

	public static void main(String[] args) {
		
		if((10>2) && ((0/10)==0))
		{
			System.out.println("Ok");
		}
		else
		{
			System.out.println("not ok");
		}
		
		//System.out.println(10/0);// Exception
		System.out.println(10/0.0);
	}
}
