
 
public class TestDemo 
{
	public static void main(String[] args) {
		// Thread(Runnable r) .
		//we assign job to thread 
		// and thread executes that job
		
		Thread t1=new Thread(new Job());// born state
		t1.start();// ready state/runnable state
	}
}
