package stringhandling;

public class InternExample {

	public static void main(String[] args) {
		String s1=new String("JAVA");
		String s3=new String("JBK");
		s1=s3;

		
		String s4 = s1.intern();
	    String s5 = s3.intern();;
	
	   System.out.println(s4==s5);

	}

}
