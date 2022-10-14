import java.util.TreeSet;

public class TreeSetEx {

	
	public static void main(String[] args) {
		
		/* for sorting :-
		 * 1. objects must be of same type
		 * 2. objects must be comparable
		 * 
		 * TreeSet sorts objects internally . TreeSet is a sorted collection
		 * 
		 * */
		
		TreeSet  treeset=new TreeSet();
		treeset.add(3);
		//treeset.add(null);NPE
		
		treeset.add(3);
		treeset.add(2);
		treeset.add(4);
		//treeset.add("dd");// exception  
		
		System.out.println(treeset);
	}
}
