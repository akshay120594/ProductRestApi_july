import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileCopy {

	public static void main(String[] args) throws Exception {
					
			FileInputStream fis = new FileInputStream("interview.mp4");
			FileOutputStream fos = new FileOutputStream("interview2.mp4");
			
			int ch = fis.read();
			
			while(ch!=-1)
			{
					fos.write(ch);	// writing content into interview2.mp4
					ch=fis.read();
			}
			
			fos.close();
			fis.close();
			
			System.out.println("Success");
		
			
		
		
	}
}
