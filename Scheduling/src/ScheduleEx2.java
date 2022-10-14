import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class ScheduleEx2 {

public static void main(String[] args) {
	
	Calendar c=Calendar.getInstance();
	c.set(2022, 6, 30, 15, 46);
	
	Date date = c.getTime();
	
	System.out.println("wait for 5 sec");
	
	new Timer().schedule(new TimerTask() 
	{
		public void run() 
		{
			
			System.out.println("All is well");
			
		}
	}, date);
	
	
	
	
	
	
	
	
}	
	
}


