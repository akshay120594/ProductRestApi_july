package deepclonning;

public class DeepClonning {

	public static void main(String[] args) throws CloneNotSupportedException {
	
		Student student1 = new Student();
		
		Name name = new Name();
		name.fname="jbk";
		name.lname="java";
		
		student1.id=1;
		student1.name=name;
		
		Student student2 = (Student) student1.clone();
		
		System.out.println(student1);
		System.out.println(student2);
		
		System.out.println(student1.name==student2.name); // false
	
		// Different objects of Name class are created . Hence false value.
	
		student1.name.fname="JavaByKiran";
		
		System.out.println(student1.name.fname);
		System.out.println(student2.name.fname);
		
	}
}
