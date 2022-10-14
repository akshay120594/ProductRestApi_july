

public class Student {

	
	public int rno;
	public int marks;

	public Student()
	{
		
	}
	
	public Student(int rno, int marks) {
		super();
		this.rno = rno;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [rno=" + rno + ", marks=" + marks + "]";
	}

	public int getRno() {
		return rno;
	}

	public void setRno(int rno) {
		this.rno = rno;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	
	private void show()
	{
		System.out.println("I am private method");
	}
	
	public void print(int a,String name,float c)
	{
		System.out.println(a+" " + name + " " + c);
	}
		
}
