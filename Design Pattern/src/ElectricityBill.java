

import java.util.Calendar;

/* abstraction means exposing ONLY required things and hiding unnecessary things
   abstraction concept is implemented by 2 ways :- interface and abstract class
   
   e.g. interface ResultSet
        {
   				boolean next();
        }
        
    To call next() , programmer do not need to know implementation of next()
    hence it is not exposed . Programmer only need to know signature of next()
    method , so it is only exposed through interface . method signature means
    name of a method and arguments .
    
    we don't know how next() is implementated in implementation class of 
    ínterface ResultSet.
    
    All interface methods are abstract hence we say using interface we achieve
    100% abstraction .
    
    However in abstract class , we may have some methods which are defined ( concrete)
    and some methods are abstract ( undefined ) . Hence we can't say abstract class
    provides 100% abstraction .
    
    
 */

public abstract class ElectricityBill 
{
	int rate;
	abstract void setRate();

	void calculateBill(int unit)
	{
		System.out.println(rate*unit);
		
	}
	
	static ElectricityBill getObject(String planname)
	{
		if(planname.equals("domestic"))
			return new Domestic();
		
		else if(planname.equals("commercial"))
			return new Commercial();
		
		else
			return null;
	}
	
}





















