
interface myInterface
{
	void m1();
	void m2();
}

abstract class M
{
	abstract void m1();
}

public class ThreadExample {

	static void show(myInterface obj)
	{
		obj.m1();
		obj.m2();
	}
	
	public static void main(String[] args) {
		
		show(new myInterface() 
		{
			
			@Override
			public void m2() {
				System.out.println("m2");
				
			}
			
			@Override
			public void m1() {
				System.out.println("m1");
				
			}
		});
		

		M m = new M() 
		{
			
			@Override
			void m1() {
				
				System.out.println("abstract class method");
				
			}
		};
		
		m.m1();
		
		
		
		new Thread(new Runnable() 
		{
			
			@Override
			public void run() {


				System.out.println("Hello");
				
			}
		}).start();;
		
		
		
		
	}
}
