import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

/*
 create abc.txt and write below contents in that file :-
 
 java is easy language
 java is object oriented language .
 we need to understand object and object reference to understand java language .
  
 Assignment :-  Find out how many times java word has appeared in abc.txt file .
 
 */
public class ReadTextFileUsingFileReader 
{
		public static void main(String[] args) throws Exception {
			
			FileReader reader = new FileReader("abc.txt");
			
			
			BufferedReader br = new BufferedReader(reader);
			
			String line=br.readLine(); 
			// readLine() reads complete line at a time instead of just single character 
			
			while(line!=null)
			{
				System.out.println(line);
				
				line=br.readLine();
			}
		
		}
}
