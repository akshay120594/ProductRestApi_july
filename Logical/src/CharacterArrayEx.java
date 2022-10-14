
public class CharacterArrayEx {

	
	public static void main(String[] args) {
		
		char[]  ch = {'a','b'};
		
		System.out.println(ch);
		
		String s = ch.toString();
		
		System.out.println(s);

		int[]  numbers = {1,2};
		
		System.out.println(numbers);
		
		
		String s2=null;
		
		System.out.println(s2);
		
		// toString() it is added by compiler everytime we print reference
		// using println()
		
		// Except in 2 cases :-
		
		// 1. If reference is null
		// 2. If char[] is present
	}
}
