

import java.lang.annotation.*;
import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.Arrays;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MySingle
{
     int m(); // member
}


class MyClass
{
	
	@MySingle(m=200)
	public void myMethod()
    {
    	System.out.println("Hello");
    	     
    }
}


public class Demo
{
public static void main(String... args) throws Exception
{
     MyClass obj=new MyClass();
     // Class.forName("java.lang.String") would give object of java.lang.Class class . This object will know everything about String class
         
     System.out.println(Arrays.toString(Class.forName("java.util.ArrayList").getDeclaredMethods()));
    
     Method m=obj.getClass().getMethod("myMethod");
     MySingle anno=m.getAnnotation(MySingle.class);
     System.out.println("Value= " + anno.m());
}
     
}


