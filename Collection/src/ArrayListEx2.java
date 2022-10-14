import java.util.ArrayList;

public class ArrayListEx2 {

	public static void main(String[] args) {
		
		ArrayList arrayList = new ArrayList();
		arrayList.add(10);
		arrayList.add(new String("KiranAcademy"));
		
		Integer i =(Integer) arrayList.get(0);
		int a=i.intValue();
		System.out.println(a);
		
		// i==> [10 intValue()] Integer class object
			
		
		String s =(String) arrayList.get(1);
		System.out.println(s.contains("ranA"));
		
		// s==> [KiranAcademy length()] String class object
	}

}
