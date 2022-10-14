package array;

import java.util.Arrays;

public class NonPrimitiveArrayExample2 {

	public static void main(String[] args) {
		
		Student[] students=new Student[3];
		
		System.out.println(Arrays.toString(students));
	
		students[0]=new Student(1,50);
		students[1]=new Student(2,78);
		students[2]=new Student(3,80);
				
		System.out.println(Arrays.toString(students));
				
		for(Student student:students)
		{
			if(student.marks>85)
				System.out.println(student);
		}
			
		for(int index=0;index<students.length;index++)
		{
			System.out.println(students[index]);
		}
		
		
		// (1,50) ,(2,78) ,(3,80)
		int count=0;
		
		Student maxStudent=null;
		
		for(Student student:students)
		{
			if(student.marks>70)
			{
				count++;
				
			}
		}
		
		System.out.println("total " + count);
	}
}
