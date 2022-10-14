package hashmapex;

import java.util.HashMap;
import java.util.TreeMap;

public class HashMapExample {

	

	public static void main(String[] args) {
		
	
		HashMap<Integer,Employee>  hashmap = new HashMap<Integer, Employee>();
	
		int eid,salary;
		String ename;
		
		Employee e1=new Employee(eid=1,salary=10000,ename="sachin");
		
		Employee e2=new Employee(eid=2,salary=20000,ename="amol");
		
		Employee e3=new Employee(3,30000,"pravin");
				
		hashmap.put(e2.eid,e2);
		hashmap.put(e3.eid,e3);
		hashmap.put(e1.eid,e1);
		
		System.out.println(hashmap);
						
		Employee e = hashmap.get(2);
		e.salary=50000;
		e.ename="rupesh";
		
		System.out.println(hashmap);
		
		System.out.println(new TreeMap(hashmap));// TreeMap will sort entries based on key
		
	}
}
