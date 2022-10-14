package abstraction;

interface Operations
{
	void add(int a,int b);
	public abstract void sub(int a,int b);
	
	public static final int age=12;
	
}


public class OperationImpl  implements Operations 
{

	@Override
	public void add(int a, int b) {
		
		System.out.println(a+b);
		
	}

	@Override
	public void sub(int a, int b) {
	
		System.out.println(a-b);
	}

	void m1()
	{
		System.out.println("method from implementation class");
	}

}
