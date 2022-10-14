package stringhandling;

public class SCPExampl {
	
	public static void main(String[] args) {
		
		String s1="JBK";  // s1,s2==>[JBK] String class object
		String s2="JBK";
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		
		String s3=new String("JBK");// s3==>[JBK]
		String s4=new String("JBK");// s4==>[JBK]
		
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));
		
		
		
		String s5=new String("JAVA");
		
		String s6=s5.intern();
		
		System.out.println(s5==s6);
		System.out.println(s5.equals(s6));
		
		
		
		
		
		
		
	}

}
