package array;

public class ToStringEx {

	public static void main(String[] args) {
		
		
		int[] a= {10,20};
		System.out.println(a);
		
		char[] c= {'a','b'};
		System.out.println(c.getClass().getName());
		System.out.println(c);
		
		float[] t= {10.2f,20.3f};
		System.out.println(t);
		
		
		int[] a1= {10,20}; // a1==>[10,20] array object
		int[] a2= {10,20}; // a2==>[10,20] arrayobject
		
		System.out.println(a1==a2);
		System.out.println(a1.equals(a2));
		
		
	}

}
