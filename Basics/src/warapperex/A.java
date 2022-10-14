package warapperex;

public class A {
	
	static Integer i;
	static int a;
	
	public static void main(String[] args) {
		
			System.out.println(i);// null
			System.out.println(a);//0
			
		//	i.intValue();// NPE as reference is null , hence NUllPointerException
			
			i=new Integer(10);
			
			System.out.println(i.intValue());
			
			
			
	
	}

}
