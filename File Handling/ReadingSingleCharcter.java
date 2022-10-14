import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ReadingSingleCharcter {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter your character :- ");
		
		int ascii =br.read();
		
		System.out.println(ascii);
		
		char ch = (char)ascii;
		System.out.println(ch);
		
		
		Scanner scanner = new Scanner(System.in);
		
System.out.println("Enter your character :- ");
		
		char c = scanner.next().charAt(0); // "b".charAt(0);
		
		// method chaining means calling multiple methods in a single line
		
		System.out.println(c);
		
		scanner.close();
		
		
	}
}
