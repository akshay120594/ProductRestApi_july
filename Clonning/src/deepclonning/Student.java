package deepclonning;

public class Student implements Cloneable {

	int id ;
	Name name; // Dependent object
	
	// In shallow cloning duplicate object of Dependent object is NOT created
	// In deep cloning duplicate object of Dependent object is created by calling clone() on dependent object also 
	
	@Override
	public Object clone() throws CloneNotSupportedException
	{
		Student clonnedStudent = (Student) super.clone();
		
		clonnedStudent.name=(Name)name.clone();
				
		return clonnedStudent;
			
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
		
}
