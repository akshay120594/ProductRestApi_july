import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class WriteDemo1 {

	public static void main(String[] args) throws Exception  {
				
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Enter String :- ");
			String s=scanner.nextLine();
			
			// [C:/batches/abc.txt] java program   =======    [] abc.txt
			// [URL of database ] java program     ========     [] database
						
			FileOutputStream fos = new FileOutputStream("abc.txt"); // true for appending
			
			fos.write(s.getBytes());
												
			fos.close();
			scanner.close();
		
		
	}
}
