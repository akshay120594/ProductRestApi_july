
package stringhandling;

import java.io.File;
import java.util.Arrays;

public class StringClassMethodsExample {
	
	public static void main(String[] args) {
		
		System.out.println("unhappy".substring(2));
		
		System.out.println("unhappy".substring(3,6));
		
		//          012345678910
		String s = "javabykiran";
		
		String sub=s.substring(4, 7);
			
		System.out.println(sub);
				
		int index1=s.indexOf('v');
		System.out.println(index1);
		
		int index2=s.lastIndexOf('v');
		System.out.println(index2);
		
	
		String s1 = "jbk";
		char[] d = s1.toCharArray();
		System.out.println(Arrays.toString(d));
		
	
	String s2="abc.txt";
		
	System.out.println(s2.endsWith(".txt"));
		
		
		
		
		String s3="Mrs.Santosh";
		
		if(s3.startsWith("Mr."))
		{
			System.out.println("male");
		}
		
		else
		{
			System.out.println("female");
		}
		
		
//		
		String s23="My name is India";
		System.out.println(s23.contains("is"));
//		
//		
		String s31="JBK";
		
		System.out.println(s31.equalsIgnoreCase("jbk"));;
		System.out.println(s31.equals("jbk"));;
		
//		
//		
//		
		String s4="JAVA";
		System.out.println(s4.toLowerCase());
		
		String s5="java";
		System.out.println(s5.toUpperCase());
		
		
		String s6=" ab c ";
		System.out.println(s6.length());
		System.out.println(s6.trim().length());// trim() removes space present at start and end of string
		
		// [ab c  length() charAt()] String class object
		
		byte[] bytes=s6.getBytes(); // getBytes gives us byte array
		
		System.out.println(Arrays.toString(bytes));
		
		
		
	}

}
