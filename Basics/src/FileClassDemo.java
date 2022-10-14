import java.io.File;

public class FileClassDemo {

	public static void main(String[] args) throws Exception{
		
		
		File file = new File("C:/batches/abc.txt");
		file.createNewFile();
		
		long size = file.length();
		System.out.println("Size of file is " + size);
		
		//file.delete();
		
		
		
	
	}
}
