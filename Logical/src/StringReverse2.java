
public class StringReverse2 {

	
	public static void main(String[] args) {
		
		String s="JBK";// [j][b][k]
					   //  0  1  2
		
		for(int i=s.length()-1;i>=0;i--)
			System.out.print(s.charAt(i));
	
		
		StringBuffer sb = new StringBuffer();
		sb.append(s);
		sb.reverse();
		
		System.out.println();
		System.out.println(sb);
	}
}
