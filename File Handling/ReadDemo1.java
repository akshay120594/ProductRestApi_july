import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadDemo1 {

	public static void main(String[] args) throws Exception {
					
			FileInputStream fis = new FileInputStream("abc.txt");  // // [] java program=======[] abc.txt
			
			int ch = fis.read();
			
			System.out.println("ascii value of first character from file is " + ch);
			
			while(ch!=-1)
			{
				//System.out.print(ch + "" + (char)ch + "  ");
				System.out.print((char)ch);
				ch=fis.read();
			}
			
			fis.close();
			
			
			
			
				
	}
}
