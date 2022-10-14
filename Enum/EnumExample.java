
enum Language
{
	C,Cplus,JAVA;
	
	Language()
	{
		System.out.println("Constructor called");
	}
	
	public static void main(String[] args) {
		
		System.out.println("I am from enum");
	}
}

public class EnumExample {
	
	public static void main(String[] args) {
		
		Language obj=Language.C;
		
		System.out.println(obj);
		
		Language[] languages = Language.values();
		
		for(Language language : languages)
			System.out.println(language + " " + language.ordinal());
		
	}

}
