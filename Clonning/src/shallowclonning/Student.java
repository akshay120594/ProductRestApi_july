package shallowclonning;

public class Student implements Cloneable{

	int id ;
	Name name;
		
	public static void main(String[] args) throws Exception{
		
		Student student1 = new Student();
		
		Name name = new Name();
		name.fname="JavaByKiran";
		name.lname="java";
		
		student1.id=1;
		student1.name=name;
		
		Student student2=(Student) student1.clone();
		
		System.out.println(student1);
		System.out.println(student2);
		
		System.out.println(student1==student2);
		System.out.println(student1.name == student2.name); //true
		
		// ONLY ONE copy Name class object is created and both references are pointing to same object 
		
		
student1.name.fname="kiranacademy";
		
		System.out.println(student1.name.fname);
		System.out.println(student2.name.fname);
		
		student1.id=100;
		System.out.println(student1.id + " " + student2.id);
		
	}
	
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
}
