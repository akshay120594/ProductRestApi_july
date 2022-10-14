
public class checkRepeat {

	// jva
	public static boolean IsRepeat(String s)
	{
		boolean b=false;
		
		for(int index=0;index<s.length();index++)
		{
			char ch=s.charAt(index);
			int firstIndex=s.indexOf(ch);
			int lastIndex=s.lastIndexOf(ch);
			
			if(firstIndex!=lastIndex)
			{
				b=true;
				break;
			}
		}
		
		return b;
	}
	
	public static void main(String[] args) {
		
		String s ="java is easy";
		
		String[] strings=s.split(" ");
		
		for(String word:strings)
		{
			System.out.println(word + " contains repeated character is " + IsRepeat(word));
		}
	
	}
	
}
