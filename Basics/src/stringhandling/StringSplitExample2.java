package stringhandling;

public class StringSplitExample2 {

	public static void main(String[] args) {
		
		String today = "java is easy";
							
		/* split() method gives us String array . strings  is a name , we have assigned to that array */
													//	  0       1      2
		String[] strings = today.split(" ");// strings ["java"]["is"]["easy"]
		
		//for(classname reference : nameofarray)
		
		//as array is String object , hence classname will be String
		// string is a reference which will point to String class objects present inside String array whose name is strings
		// strings is a name of array
		
		for(String string : strings)
		{
			System.out.println(string);
		}
			
		for(int index=strings.length-1 ; index>=0 ; index--)
		{
			System.out.print(strings[index] + " ");
		}
		
		
	}
}






