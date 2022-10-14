import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

import static java.lang.System.out;

// If you import static variable/method , then we can call static members without class name

import static java.lang.Thread.sleep;

import static java.util.Collections.binarySearch;
 
public class TryWithResourceExample2 {

	public static void main(String[] args) throws IOException 
	{
		// try with resource statement automatically close resource . no need to close() .
			
		try(FileOutputStream fos=new FileOutputStream("abc.txt"))
		{
		
			fos.write("java is NOT difficult".getBytes());
			out.println("hello");
			
			sleep(2000);
			
			out.println(binarySearch(Arrays.asList(1,2,4),2));
		
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}
}
