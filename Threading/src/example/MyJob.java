package example;

public class MyJob implements Runnable
{
	
	Task task=new Task();
	
	@Override
	public void run() 
	{
		
		task.calculate();
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		MyJob job = new MyJob();
		
		Thread t1=new Thread(job,"First");
			
		Thread t2=new Thread(job,"Second");
		
		t1.start();
		
		t2.start();
	}
	
}
