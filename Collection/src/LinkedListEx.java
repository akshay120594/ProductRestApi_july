
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListEx {

	public static void main(String[] args) {
		
		LinkedList linkedList = new LinkedList();
		linkedList.add(new Integer(10));//0
			
		linkedList.add(new String("KiranAcademy"));//2
		
		System.out.println(linkedList);
			
		linkedList.add(1, new Integer(20));
			
		System.out.println(linkedList);
		
		linkedList.remove(1);
		
		System.out.println(linkedList);
		
		linkedList.add(new Integer(20));
		
		System.out.println(linkedList);
		
		/* ArrayList should be used to add and retrieve objects 
		   LinkedList should be used to insert or remove objects from collection
		*/
	
		
		ListIterator listIterator=linkedList.listIterator();
		
		while(listIterator.hasNext())
			System.out.println(listIterator.next());
			
		
		System.out.println("reading in backward direction :-  ");
		
		while(listIterator.hasPrevious())
			System.out.println(listIterator.previous());
		
		
		
		

	}

}
