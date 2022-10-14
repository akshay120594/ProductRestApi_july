import java.io.FileOutputStream;
import java.io.IOException;

public class TryWithResourceExample {

	public static void main(String[] args) throws IOException 
	{
		
		FileOutputStream fos=null;
		
		try
		{
			fos = new FileOutputStream("abc.txt");
			fos.write("java is NOT difficult".getBytes());
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		finally
		{
			fos.close();
		}
	}
}
