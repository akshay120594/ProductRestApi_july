import java.util.Scanner;

class Job implements Runnable
{
	public void run() 
	{
		int count=0;
		
			// running state
		
		System.out.println("KiranAcademy");
			
		new Scanner(System.in).nextInt();// block state
			
			while(true)
			{
				System.out.println(++count);
				
				if(count>3)
					return; 
			}
			
			//System.out.println("Bye");
			
	}// dead state
	
}
