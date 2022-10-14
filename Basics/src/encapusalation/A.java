package encapusalation;

import java.util.Scanner;

public class A 
{
	// child class constructor calls parent class constructor
	A()
	{
		super();
	}
	
	Scanner scanner = new Scanner(System.in);
	int no1 = scanner.nextInt();
	int no2 = scanner.nextInt();
	
	String s=new String();
	//s.charAt(0);
	
	public static void main(String[] args) {
		
		System.out.println("Enter 2 numbers :- ");
		
		A obj = new A();
		
		System.out.println(obj.no1 + obj.no2);
		
	}
}
