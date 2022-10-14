package array;

public class FunctionEx {

	
	public static void main(String[] args) {
		
		display(1);
		
	}
		
	static void display(int count)
	{
		
		System.out.println(count);
		
		if(count<3)
		
			display(++count); // recursion
		
	}
}
