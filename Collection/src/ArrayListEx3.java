import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx3 {

	public static void main(String[] args) {
		
	
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(10);// arrayList.add(Integer.valueOf(10)); 
		arrayList.add(20);
		Integer i = arrayList.get(0); // no type casting required
		
		Iterator<Integer> iterator = arrayList.iterator();
		
		while(iterator.hasNext())
		{
			Integer integer =iterator.next(); // integer ==>[10 intValue()] Integer class object
			
			System.out.println(integer.intValue());
		}
		
		Integer ob= Integer.valueOf(12);
		Integer ob2= Integer.valueOf("12");
		int o=Integer.parseInt("30");
		
		String d=String.valueOf("10");
		
		String u=String.valueOf(10);
		
		String h=String.valueOf('a');
		
		
		char ch='k';
		String r=ch+"";
		
		
		boolean b;
		Boolean p;
		
		int ans=Integer.sum(30, 40);
		System.out.println(ans);
		
		
		
}
}
