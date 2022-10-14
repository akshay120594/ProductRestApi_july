package warapperex;

public class Boxing {
	
	public static void main(String[] args) {
		
		// conversion of primitive into object is called boxing
		
		int a=10;
		
		Integer i = Integer.valueOf(a); // boxing
		
		Integer o=a;// Autoboxing as Integer class object will be created internally
		
	}

}
