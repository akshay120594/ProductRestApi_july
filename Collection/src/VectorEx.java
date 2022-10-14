import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		
		Vector<Integer> vector = new Vector<>();
		
		vector.addElement(10);
		vector.addElement(20);
		vector.addElement(30);
		
		
		Enumeration<Integer> enumeration=vector.elements();
		while(enumeration.hasMoreElements())
			System.out.println(enumeration.nextElement());
		
		Vector vector2 = new Vector<>();

		vector2.addElement(40);
		
		vector2.addAll(vector);
		
		System.out.println(vector2);
	}

}
