
class Job3 implements Runnable 
{
	int i; // instance variable

	public void run() 
	{
				System.out.println("All is well");
			
				synchronized(this) 
				{
					for (i = 1; i <= 3; i++) 
					{
						System.out.println(i + " by " + Thread.currentThread().getName());
					}
				}
    }// run() ends

}//class ends