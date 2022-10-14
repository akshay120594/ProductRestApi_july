package deepclonning;

// class Object
// {
	// protected Object clone() {  }
// }
public class Name implements Cloneable
{

	String fname , lname;
//	
	@Override
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
		
		// Student s1=new Student(1,90);
		// Student s2=new Student();
		// s2.rno=s1.rno;
		// s2.marks=s1.marks;
	}

	@Override
	public String toString() {
		return "Name [fname=" + fname + ", lname=" + lname + "]";
	}
	
	public static void main(String[] args) throws Exception {
		
		new Name().clone();
	}
}
