package array;

import java.util.Arrays;

public class NonPrimitiveArrayExample {

	public static void main(String[] args) {
		
		Student[] students=new Student[3];
		
		System.out.println(Arrays.toString(students));
	
		students[0]=new Student(1,70);
		students[1]=new Student(2,20);
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
		
		
		// (1,70) ,(2,20) ,(3,80)
		int max=0;
		
		Student maxStudent=null;
		
		for(Student student:students)
		{
			if(student.marks>max)
			{
				max=student.marks;
				maxStudent=student;
				
			}
		}
				
		System.out.println(maxStudent);
		
		
		// min=70

		// (1,70) ,(2,20) ,(3,80)
		int min=students[0].marks;
		
		Student minStudent=students[0];
		
		for(int index=1 ; index<students.length ; index++)
		{
			if(students[index].marks < min)
			{
				min=students[index].marks;
				minStudent=students[index];
				
			}
		}
		
		
		System.out.println(minStudent);
	
	}
}
