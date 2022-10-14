package cache;

import java.util.HashMap;
import java.util.IdentityHashMap;

class A
{

public static void main(String[] args) {
	
/* 
IdentityHashMap consider address stored in key to compare whether keys are duplicated or not
HashMap consider content stored in key to compare whether keys are duplicated or not
key must have implemented equals() & hashcode()
 
 */

//IdentityHashMap<Integer, String> hm = new IdentityHashMap<Integer, String>();

//Integer i1 = 10; //i1(1000),i2 (1000)==> [10] Integer class object at address 1000
//
//Integer i2 = 10;
//
//
//hm.put(i1, "hello");  // 10 hi
//hm.put(i2, "hi");
//
//System.out.println(hm);
//System.out.println(i1==i2);


// Integer class has overriden equals() and hashcode() both methods , and hence if 2 Integer
// class objects's contents are equals then their hashcode will be equal. Hence hashmap will
// will consider these keys duplicate keys .
	
//IdentityHashMap<Integer, String> hm2 = new IdentityHashMap<Integer, String>();

HashMap<Integer, String> hm2 = new HashMap<Integer, String>();

Integer i8 = new Integer(10); //i8 (1000)==> [10] Integer class object at address 1000

Integer i9 = new Integer(10);//i9 (2000)==> [10] Integer class object at address 2000

System.out.println(i8.hashCode());
System.out.println(i9.hashCode());

hm2.put(i8, "hello");  
hm2.put(i9, "hi");     // 10 hi

System.out.println(hm2);



String s1="jbk";   //s1,s2==> [JBK] String class object at address 1000
String s2="jbk";

System.out.println(s1==s2);

Integer i3=Integer.valueOf(128); // i3(1000)  ===>[128] Integer class object at address 1000
Integer i4=Integer.valueOf(128);// i4(2000)  ===> [128] Integer class object at address 2000

System.out.println(i3==i4);


Integer i5=Integer.valueOf(125); // i5(1000) ,i6(1000) ===>[125] Integer class object at address 1000
Integer i6=Integer.valueOf(125);

System.out.println(i5==i6);

/*In autoboxing we get adavantage of cache 
 * 
 * -128 to 127 , Integer objects will be cached 
 * */

}

}

