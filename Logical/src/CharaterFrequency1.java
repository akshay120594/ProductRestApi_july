import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;

public class CharaterFrequency1 {

	public static void main(String[] args) {
		
		HashMap<Character,Integer>   hashmap = new HashMap<>();
		
		String s ="KiranAcademy";
		
		int i=0;
		
		while(i<s.length())
		{
			char ch = s.charAt(i);
			if(hashmap.containsKey(ch))
			{
				hashmap.put(ch,hashmap.get(ch)+1);
			}
			else
			{
				hashmap.put(ch,1);
			}
			
			i=i+1;
		}
		
		System.out.println(hashmap);
		
		/* Reading hashmap entries */    // ['J','a','v'] Set 
		
		Set<Character> set = hashmap.keySet();
		
		for(Character key : set)
		{
			System.out.println(key + " has occured " + hashmap.get(key) + " times");
		}
	}
	
	
	

}
