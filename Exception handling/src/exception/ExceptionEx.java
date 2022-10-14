package exception;

import java.util.ArrayList;

public class ExceptionEx 

{
		
static ArrayList arrayList; // declared reference variable
		
public static void main(String[] args) {
	
	//arrayList=new ArrayList(); // Initialized reference variable
	
	System.out.println(10/0); // replace 0 by 0.0 & observe change
	
	System.out.println(arrayList.size());
		
	System.out.println("All is well");
	
}
}
