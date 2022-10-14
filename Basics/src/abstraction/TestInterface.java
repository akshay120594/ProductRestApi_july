package abstraction;

import java.util.Calendar;

public class TestInterface {

	
	public static void main(String[] args) {
		
		//new Operations();
		Operations op = new OperationImpl();
		
		op.add(10, 20);
		op.sub(20, 10);
		
	((OperationImpl)op).m1(); 
	//op.m1(); 
	System.out.println(op.toString());
	
	new OperationImpl().add(12, 30);
	
	System.out.println(Operations.age);
	
	//Operations.age=40;
	
	
	Calendar.getInstance();
		
	}
}
