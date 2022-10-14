import java.util.Arrays;

public class TestToString {

	public static void main(String[] args) {
		
		
		String s = "KiranAcademy";
		System.out.println(s);
		
		String[] strings= {"Java","is","easy"};
		System.out.println(Arrays.toString(strings));
		
		String string2 = Arrays.toString(strings);
		String[] newStrings=string2.split(",");
		
		
		for(String k : newStrings)
			System.out.println(k);
		
		char[] ch= {'a','b'};
		System.out.println(ch);
		
	}

}
