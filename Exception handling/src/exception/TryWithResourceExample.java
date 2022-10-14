package exception;

import java.io.FileOutputStream;

public class TryWithResourceExample {

	
	public static void main(String[] args) {
		
		// when we use try with resource , we do not need to close resource in finally block
		
		try(FileOutputStream fos = new FileOutputStream("abc.txt"))
		{
			
		}
		
		catch(Exception e)
		{
			
		}
	}
}
