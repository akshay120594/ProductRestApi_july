
public class AnonymousClassEx {

	public static void main(String[] args) {
		
		// lambda expression is for functional interface (interface having only one abstract method)
		
		// Anonymous class is for functional and non-functional interfaces both
		
		// Lambda is not for abstract class. Anonymous class can be used for this.
		
		new Thread(new Runnable() 
		{
			
			@Override
			public void run() {
				
				System.out.println("java is easy");
			}
		}).start();
		
		// Thread(Runnable r)
		
		new Thread(()->System.out.println("java is easy")).start();
		
		
		/*
		 * interface runnable
		 * {
		 * 		public void run();
		 * }
		 */
		
		
	}
}
