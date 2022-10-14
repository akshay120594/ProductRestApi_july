package warapperex;

public class UnBoxing {
	
	public static void main(String[] args) {
		
		// conversion of object  into primitive  is called unboxing
		
		Integer i=new Integer(10);
		
		int  a= i.intValue();//unboxing
		
		int o=i;// Autounboxing as internally intValue() will be called to get primitive from wrapper class object
		
	}

}
