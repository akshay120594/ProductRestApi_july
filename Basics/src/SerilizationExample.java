import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class SerilizationExample 
{
		
public static void main(String[] args) throws FileNotFoundException, IOException {
	
	 ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("abc.txt")) ;
	
// Writing contents of object into file is called Serialization

	// OutputStream is a abstract class . abstract class object is not possible
	// FileOutputStream is a child class of OutputStream class 
	
   // ObjectOutputStream(OutputStream out) 
		// Employee(int eno,int salary)
    oos.writeObject(new Employee(1, 1000));

// 1,1000 is content of Employee object . 
 // we are storing / writing these contents into myfile.txt file . 
  // this is called Serilization
		
    System.out.println("Done");
	
	
}

}
