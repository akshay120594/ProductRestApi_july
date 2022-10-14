package hashmapex;

import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class HashMapExample2 {

	
	public static void main(String[] args) {
		
	
		HashMap<Integer,Employee>  hashmap = new HashMap<Integer, Employee>();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("How many objects ? ");
		int size=scanner.nextInt();
			
		
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter eid,salary and name :- ");// 2 2000 ramesh
			int eid=scanner.nextInt();
			hashmap.put(eid,new Employee(eid,scanner.nextInt(),scanner.next()));
		}
		
		String data = hashmap.toString();
		
		System.out.println(data);
		
		System.out.println(hashmap.toString());
				
	}
}
