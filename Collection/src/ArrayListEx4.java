import java.util.ArrayList;

public class ArrayListEx4 {

	public static void main(String[] args) {
	
		// we are informing compiler that in ArrayList object , we will add store 
		// String objects ONLY .It is called as Generic Collection
		
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("Java");//0
		arrayList.add("JBK");//1
		//arrayList.add(10);
		
		String i = arrayList.get(0); // no type casting required
		
		arrayList.set(1,"KiranAcademy");
		
		System.out.println(arrayList);
		
		
		// we are informing compiler that in ArrayList object , we will add 
		// Integer objects ONLY .It is called as Generic Collection
				
		ArrayList<Integer> arrayList2 = new ArrayList<Integer>();
		
		arrayList2.add(1);//0
		arrayList2.add(2);//1 index
		arrayList2.add(3);//2
		
		// below remove is accepting primitive int value 1  remove(int index)
		
		arrayList2.remove(1);// 1 is index here . so element 2 will be removed as it's index 1
		System.out.println(arrayList2);
		
		arrayList2.remove(new Integer(1));//we are passing object . remove(Object o)
		
		System.out.println(arrayList2);
		
		// c--add()
		// r--get()
		// u--set()
		// d--remove
		
		// create read update delete (CRUD) not CURD
}
}
