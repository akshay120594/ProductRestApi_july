
public class StringExample {

	public static void main(String[] args) {
		
		String s ="java";
		
		//  s [j][a][v][a]
		//     0  1  2  3
		
		System.out.println(s.charAt(1));
		System.out.println(s.charAt(4)); // StrinIndexOutOfBoundsException
		
	}
}
