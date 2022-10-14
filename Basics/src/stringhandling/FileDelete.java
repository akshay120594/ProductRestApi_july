package stringhandling;

import java.io.File;

public class FileDelete {

	
	public static void main(String[] args) {
		
		// f==> [ listFiles()] File class object .
		File f=new File("C:\\jar file\\array");
		
		File[] files=f.listFiles(); // [[1.txt][2.txt][A.class][B.class]] File Array
		
		for(File file :files)
		{
			System.out.println(file.getName());
			if(file.getName().endsWith(".txt"))
				System.out.println(file.delete());
					
		}
			
	}
}
