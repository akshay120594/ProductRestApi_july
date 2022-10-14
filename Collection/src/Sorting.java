import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class Sorting {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(10,20,10);
		
		Collections.sort(list);// duplicates are retained
		
		System.out.println(list);
		
		TreeSet<Integer> treeset = new TreeSet<Integer>(list);
		System.out.println(treeset);// duplicates are removed
		

	}

}
