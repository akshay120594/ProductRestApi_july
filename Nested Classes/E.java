
public class E 
{

	/* static nested class can access static members of outer class directly
	 * To access non-static members , use object or object reference .
	 * 
	 * non-static inner class can access static and non-static both members directly
	 * static inner class can access static members of outer class directly
	 * To access non-static members , use object or object reference .
	 * */
	static int no=20;
	int no2;
	
	/* static nested class can have static main() method*/
	static class G
	{
		int x=10;
						
		public static void main(String[] args) 
		{
			
			G obj = new G();
			System.out.println(obj.x);
			System.out.println(no);
			System.out.println(new E().no2);
		}
	}
	
}


