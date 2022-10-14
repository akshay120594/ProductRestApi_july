package example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ParalleProcessing {
	
	public static void main(String[] args) throws Exception {
		
		List<Integer> arrayList=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		/* Suppose we want to print square of each number from above list
		 * For this we will use 2 threads .
		 * First thread will calculate and display square of initial 5 numbers (1-5)
		 * Second thread will calculate and display square of remaining 5 numbers (6-10)
		 * Both these threads will execute parallel and hence our tasks will finish in less
		 * time .
		 * */
		
		Job1 job1=new Job1();
		job1.arrayList=arrayList;
		
		Job2 job2=new Job2();
		job2.arrayList=arrayList;
		
		Thread t1=new Thread(job1);
		Thread t2=new Thread(job2);
		
		t1.start();
		
		t2.start();
		
	}

}
