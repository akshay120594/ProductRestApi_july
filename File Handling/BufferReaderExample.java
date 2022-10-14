

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReaderExample 
{
		public static void main(String[] args) throws Exception 
		{
			
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Enter your name :- ");
			String name = br.readLine();
			
			System.out.println("Enter your roll number :- ");
			String str = br.readLine();
			
			int rno = Integer.parseInt(str);
				
			
			System.out.println(rno + " " + name);
			
			
		}
}
