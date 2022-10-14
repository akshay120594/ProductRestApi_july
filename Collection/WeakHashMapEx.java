package collection;

import java.util.HashMap;
import java.util.WeakHashMap;

public class WeakHashMapEx {

	public static void main(String[] args) 
	{
		// Garbage collector dominates WeakHashMap means if object is associated
		// with WeakHashMap , still it can be destroyed by garbage collector .
		// In case of HashMap , object will be not destroyed even if it does not have any
		// reference . HashMap dominates garbage collector .
			
		WeakHashMap<B, String>  hashmap=new WeakHashMap<B, String>();
		
		B b=new B();
		
		hashmap.put(b,"Java");
		
		System.out.println(hashmap);
		
		b=null;
		
		System.gc();// will invoke garbage collector
		
		System.out.println(hashmap);
	
	}

}


class B
{
	String data="JBK";
		
	@Override
	public String toString() {
		return "B [data=" + data + "]";
	}

	public void finalize()
	{
		System.out.println("finalize method called");
	}
}
