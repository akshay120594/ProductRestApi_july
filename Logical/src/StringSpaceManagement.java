
/* string challenge have the function string challenge(str) take the str parameter being passed 
 * and return the string true if the characters a and b are separated by exactly 3 places 
 * anywhere in the string at least once (is. "lane borrowed" would result in true because there is exactly three characters between a and b). 
 * otherwise return the string false. */


public class StringSpaceManagement {

	
	public static void main(String[] args) {
		
		boolean ans;
		
		String s="lane borrowed";
		ans=checkSpace(s);
		
		System.out.println(ans);
		
		s="java by kiran";
		
		ans=checkSpace(s);
		
		System.out.println(ans);
		
		s="javabykiran";
		
		ans=checkSpace(s);
		
		System.out.println(ans);
		
		
		s="pabcdb";
		
		ans=checkSpace(s);
		
		System.out.println(ans);
		
		
	}
	

	static boolean checkSpace(String s)
	{
		
		boolean ans=false;
				
		char[] chars=s.toCharArray();
		
		//lanebora
		for(int index=0;index<chars.length-4;index++)
		{
			if(chars[index]=='a' && chars[index+4]=='b')
			{
				System.out.println("a is at " + index+" b is present at " + (index+4));
				ans=true;
				break;
			}
		}
		
		return ans;
		
	}
}
