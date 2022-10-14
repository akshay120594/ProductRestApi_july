package encapusalation;

public class TestStudent {
	
// s===>[ JBK toString() ] String class object

	static String s = new String("JBK");
	static Student s1 = new Student();
	
	// s1===>[rno=0 name=null] Student class object
	
	public static void main(String[] args) {
		
		System.out.println(s);
		System.out.println(s.toString());
		System.out.println(s.length());
		
		System.out.println(s1);
		System.out.println(s1.toString());
		
		Student student = new Student();
		
		// student==>[rno=0 name=null] Student class object
	
		System.out.println(student);
		
		
	}

}
