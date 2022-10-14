import java.util.HashSet;
import java.util.TreeSet;

public class HashSetEx {

	/* HashSet does not allow duplicates and It is not Ordered Collection */
	
	public static void main(String[] args) {
		
		HashSet<Integer>  hashset=new HashSet<Integer>();
		
		hashset.add(10);
		hashset.add(20);
		hashset.add(10);
		hashset.add(null);
		hashset.add(null);// only one null will be added 
		
		System.out.println(hashset);
		
		TreeSet<Integer> treeset=new TreeSet<Integer>(hashset);
		System.out.println(treeset);
		
	}
}
