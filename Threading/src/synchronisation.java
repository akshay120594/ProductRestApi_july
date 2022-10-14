

import java.util.Collections;
/* When we make object synchronized , at a time , ONLY ONE thread is allowed to update object  
 * 2 ways to achieve synchronization :-
 * 
 * 1) make entire run() method synchronized 
 * 2) use synchronized block- it makes particular code synchronized , code that is updating object is made synchronized .
 * 
 * rest of the code remains asynchronized . it means it will execute simultenously .
 * 
 * .*/
public class synchronisation 
{
	
	public static void main(String[] args) 
	{
		
	
		Job3 job = new Job3();
		
		// Thread(Runnable r , String s)
		
		Thread t1=new Thread(job,"akash");
		Thread t2=new Thread(job,"akshay");
		
		
		t1.start();
		t2.start();
		
	}
}


