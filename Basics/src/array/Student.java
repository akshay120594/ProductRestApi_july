package array;

public class Student {

	int rno,marks;

	public Student(int rno, int marks) {
		super();
		this.rno = rno;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "rno=" + rno + "\nmarks=" + marks ;
	}
	
	public static void main(String[] args) {
		
	 System.out.println(new Student(1,10));
	}
	
	
	
}
