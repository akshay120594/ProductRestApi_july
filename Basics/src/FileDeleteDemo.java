import java.io.File;
import java.util.Arrays;

public class FileDeleteDemo {

	public static void main(String[] args) {
		
		// File class object is used to represent file and directory both
		// It means in constructor of File class , we can pass file name or directory name
		
		File file = new File("C:\\batches\\myFiles"); // myFiles is a directory name . we need to create this directory 
				
		String[] fileNames=file.list(); // list() would return String[] having all filenames which are present in this directory .
		
System.out.println(Arrays.toString(fileNames));// toString() would give contents of String array fileNames

for(String fileName : fileNames)
{
	if(fileName.endsWith(".txt"))
	{
		System.out.println(fileName + " should be deleted");
		
		String path="C:/batches/myFiles/"+fileName;
			
		new File(path).delete();
		
		System.out.println("file deleted");
	}
}

	}
}
