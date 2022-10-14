public class MultiTasking {
	
	public static void main(String[] args) 
	{
				
		PrintEven evenJob = new PrintEven();
		PrintOdd oddJob = new PrintOdd();
		
		Thread t1=new Thread(evenJob); 
		Thread t2=new Thread(oddJob);
		
		t1.start();// Thread Scheduler
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.start();
		
	}

}//class ends


class PrintEven implements Runnable
{

	@Override
	public void run() 
	{
		
		for(int i=2;i<=100;i=i+2)
		{
			
			System.out.println(i);
		}
		
	}
	
}


class PrintOdd implements Runnable
{

	@Override
	public void run() 
	{
		
		for(int i=1;i<=100;i=i+2)
		{
			
			System.out.println(i);
		}
		
	}
	
}

