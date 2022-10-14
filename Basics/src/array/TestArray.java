package array;

import java.util.Arrays;
import java.util.Scanner;

public class TestArray {

	public static void main(String[] args) {
		
		
				Scanner scanner = new Scanner(System.in);
				System.out.println("How many objects you want to Stores ? ");
				int size=scanner.nextInt();

				Student[]  students = new Student[size];
				

				for(int index=0;index<size;index++)
				{
					System.out.println("Enter roll number :- ");
					int rno=scanner.nextInt();
					System.out.println("Enter Marks :- ");
					int marks=scanner.nextInt();
					students[index] = new Student(rno,marks);
				}
				
				System.out.println(Arrays.toString(students));
	}
}
