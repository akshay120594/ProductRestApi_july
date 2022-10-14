

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.HashSet;
import java.util.Scanner;

@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.FIELD)
@interface My
{
     int member1();  // it is called member
     String member2();
}

class Access
{
	@My(member1=10 , member2="JBK")
	public int myVar;
	
}

public class MutipleAnno {

	public static void main(String[] args) throws Exception {
		
		My my=Access.class.getField("myVar").getAnnotation(My.class); // [getField() getMethod()] Class object
		
		System.out.println(my.member1());
		
		System.out.println(my.member2());
		
		String a="mumbai";  // a===>[Mumbai] String class object 
		String b=a + "pune";// b===>[Mumbaipune] String class object
		System.out.println(a);
		System.out.println(b);
		
		String className = new Scanner(System.in).next();
		
		Object o = Class.forName(className).getConstructor().newInstance();
		
		if(o instanceof HashSet)
		{
			System.out.println("Yes , it's HashSet");
		}
		System.out.println(o.toString());
		

		
		
		
		
		
	}
	
}
