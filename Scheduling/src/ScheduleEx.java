import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class ScheduleEx {

public static void main(String[] args) {
	
	System.out.println("wait for 5 sec");
	
	new Timer().schedule(new TimerTask() 
	{
		
		@Override
		public void run() 
		{
			
			System.out.println("Java has all features which programmers require");
			
		}
	},5000);
	
	
	
	
	
	
	
	
	
}	
	
}


