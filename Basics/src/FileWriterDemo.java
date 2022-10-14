import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterDemo {

	public static void main(String[] args) throws Exception {
		
		// FileWriter is used to write text in a text file only . 
		// It belong to character stream 
		
		FileWriter fileWriter = new FileWriter("xyz.txt");
		
		fileWriter.write("Java is very easy");
		
		fileWriter.close();
		
		
		// FileOutputStream is used to write text and non-text both in a file  . 
		// It belong to byte  stream 
		
		
		FileOutputStream fileOutputStream = new FileOutputStream("file1.txt",true);
		
		fileOutputStream.write("Framework makes developement fast".getBytes());
		
		fileOutputStream.close();
		
		Scanner scanner = new Scanner(System.in);
		scanner.close();
		
		
		
		
	}
}
