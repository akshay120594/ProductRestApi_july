import java.util.Calendar;


public class TestAbstraction {

	public static void main(String[] args) {
		
		ElectricityBill obj;
		
		obj=ElectricityBill.getObject("domestic");
		obj.setRate();
		obj.calculateBill(5);
 
		
		obj=ElectricityBill.getObject("commercial");
		obj.setRate();
		obj.calculateBill(5);
		Calendar c=Calendar.getInstance();
	    
	   /* In real time , we don't know child class names
	    * hence we should always take reference of parent class
	    * Normally , we get object of Child class 
	    * we don't create object of Child class as we don't know child
	    * class name
	    *  */
	}
}
