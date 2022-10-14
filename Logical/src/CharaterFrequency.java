import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;

public class CharaterFrequency {

	public static void main(String[] args) {
		
		HashMap<Character,Integer>   hashmap = new HashMap<>();
		
		String s ="Java";
		
		char[]  chars = s.toCharArray();
		
		for(char ch : chars)
		{
			if(hashmap.containsKey(ch))
			{
				hashmap.put(ch,hashmap.get(ch)+1);
			}
			else
			{
				hashmap.put(ch,1);
			}
			
		}
		
		System.out.println(hashmap);
		
		/* Reading hashmap entries */    // ['J','V','A'] Set 
		
		
		for(char key : hashmap.keySet())
		{
			System.out.println(key + " has occured " + hashmap.get(key) + " times");
		}
	}

}
