package abstraction;

public interface First {

	void add(int a,int b);
	void sub(int a,int b);
}

interface Second {

	void add(int a,int b);// change return type to int and observe error
	void mul(int a,int b);
}

/* interfaces should not have methods with same signature and different return type */

class MyClass implements First,Second
{

	@Override
	public void add(int a, int b) {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		
		First obj = new MyClass();
		obj.add(12, 23);
		obj.sub(20, 10);
		
		Second obj2 = (Second) obj;
	
		obj2.mul(20, 10);
		
	}

	@Override
	public void sub(int a, int b) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mul(int a, int b) {
		// TODO Auto-generated method stub
		
	}
	
	
}