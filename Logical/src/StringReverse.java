
public class StringReverse {

	
	public static void main(String[] args) {
		
		String s="JBK";// [j][b][k]
					   //  0  1  2
		StringBuffer sb =new StringBuffer();
		
		// sb==>[kbj] StringBuffer object
		
		for(int i=s.length()-1;i>=0;i--)
		{
			sb.append(s.charAt(i));
		}
		
		System.out.println(sb);
	}
}
