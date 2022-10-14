package stringex;


public class Vowelremoval {
	
	public static void main(String[] args) {
		
		String[] strings ={"coke","cat","basket"};
		
		for(int i=0;i<strings.length;i++)
		{
			strings[i]=removeVowel(strings[i]);
			
		}
		
		System.out.println("Array after vowel removal:- ");
		
		show(strings);
		
		
		for(int i=0;i<strings.length;i++)
		{
			
			StringBuffer sb = new StringBuffer(strings[i]);
			
			sb.reverse();
			
			strings[i]=sb.toString();
			
		}
		

		System.out.println("Array after Reverse:- ");
		
		show(strings);
		
	}

	
	static String removeVowel(String str)
	{
		str=str.replaceAll("[aeiouAEIOU]", "");
			
		return str;
	}
	
	
	static void show(String[] strings)
	{
		for(String str : strings)
		{
			System.out.println(str);
		}
			}
}
