package stringex;

		//Finding ryhming string pair
		//may-day
		//day-say
		//why-bhy
		//java

public class RhymingPairs {

	public static void main(String[] args) {
		
		
		String s ="JBKJAVA";
		System.out.println(s.substring(1,4));
		System.out.println(s.startsWith("JB"));
		System.out.println(s.endsWith("Av"));
		
		String[] words ={"may","day","say","why","bhy","good"};
				
		int i,j;
		
		String match="";
						
		for(i=0;i<=words.length-2;i++)
		{
				
			match="";

			String lastWords=words[i].substring(words[i].length()-2);

			for(j=i+1;j<=words.length-1;j++)
			{
								
				if(words[j].endsWith(lastWords))
				{
					match=words[j];
					break;
				}
				
			}
			
			if(match!="")
				
				System.out.println(words[i] + " " + match);
			
		}
		
		
	}
}
