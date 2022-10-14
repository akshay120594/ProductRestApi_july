package abstraction;

import java.util.ArrayList;

public class B {

	// In place of Parent , Child works , all properties of Parents are 
	// Available in Child
	
	static Object giveMeObject(String s)
	{
		if(s.equals("String"))
			return new String("JBK");
		
		if(s.equals("Integer"))
			return new Integer(10);
		
		return null;
	}
	
	public static void main(String[] args) {
			
		System.out.println(giveMeObject("String"));;
		System.out.println(giveMeObject("Integer"));;
		System.out.println(giveMeObject("A"));;
		
		String s = (String) giveMeObject("String");// s==>[JBK length()] String class object
		System.out.println(s.length());
		
		Integer i = (Integer) giveMeObject("Integer");// i==>[10 intValue()] Integer class object
		System.out.println(i.intValue());
		
		
		ArrayList arrayList = new ArrayList();
		
		arrayList.add(new Integer(10));// o index
		
		arrayList.add(new String("JBK"));// 1 index
		
		String o = (String) arrayList.get(1);// o==>[JBK charAt(),length()] String class object at address 1000
		
		System.out.println(o.charAt(1));
	
	}
}
