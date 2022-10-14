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
public class ReadTextFileUsingFileReader2 
{
		public static void main(String[] args) throws Exception {
			
			int count=0;
			
			FileReader reader = new FileReader("abc.txt");
						
			BufferedReader br = new BufferedReader(reader);
			
			String line=br.readLine(); 
			// readLine() reads complete line at a time instead of just single character 
			
			String word = "java";
			
			while(line!=null)
			{
				if(line.contains(word))
					count=count+1;
				
				System.out.println(line);
				
				line=br.readLine();
			}
			
			System.out.println(count);
		
		}
}
