package customexception;
public class ObjectNotFoundException extends RuntimeException
{
	String msg;
	
	ObjectNotFoundException(String msg)
	{
		this.msg=msg;
		
	}
}
