import java.util.ArrayList;
import java.util.HashSet;

public class ArrayListtEx {

	/* HashSet  allow duplicates and It is  Ordered Collection */
	
	public static void main(String[] args) {
		
		ArrayList<Integer>  hashset=new ArrayList<Integer>();
		
		hashset.add(10);
		hashset.add(20);
		hashset.add(10);
		
		System.out.println(hashset);
	}
}
