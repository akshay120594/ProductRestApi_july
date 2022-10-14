import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/* Deserilization is a process of reading contents of object from file and creating new object using that contents .*/


public class DeserilizationExample {

	
	public static void main(String[] args) throws Exception 
	{
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("abc.txt"));
	
		Employee employee =(Employee) ois.readObject(); 
		
		// employee===>[eno=1 salary=1000] Employee class object 
	
	    System.out.println(employee);
	
	}  
}

