
public class A 
{
	static A obj=null;
	
	private A()
	{
		
	}
	
	static A getObject()
	{
		if(obj==null)
		{
			obj=new A();
		}
		
		return obj;
	}
}
