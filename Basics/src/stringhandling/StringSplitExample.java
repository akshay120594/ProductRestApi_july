package stringhandling;

public class StringSplitExample {

	public static void main(String[] args) {
		
		String today = "26-10-2021";
							
		/* split() method gives us String array . strings  is a name , we have assigned to that array */
													//	  0    1      2
		String[] strings = today.split("-");// strings ["26"]["10"]["2021"]
		
		//for(classname reference : nameofarray)
		
		//as array is String object , hence classname will be String
		// string is a reference which will point to String class objects present inside String array whose name is strings
		// strings is a name of array
		
		for(String string : strings)
		{
			System.out.println(string);
		}
			
		String s2="";
		
		for(int index=strings.length-1 ; index>=0 ; index--)
		{
			s2=s2+strings[index] + "-";
		}
		
		System.out.println(s2.substring(0,s2.length()-1));
		
	}
}






