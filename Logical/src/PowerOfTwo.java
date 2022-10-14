
/* Missing elements from an array */

public class PowerOfTwo {

	public static void main(String[] args) {

		System.out.println(isPower(6));
		System.out.println(isPower(8));
		System.out.println(isPower(7));
		System.out.println(isPower(0));
		System.out.println(isPower(1));
		
	}
	// && return true if both conditions are true.
	// || return true if any one condition true, 
	static boolean isPower(int number)
	{
		//int count=0;
		
		if(number==1)
		{
			//System.out.println(count);
			return true;
		}
		if(number%2==1 || number==0)
		{
			return false;
		}

		while(number!=1)
		{
				
				if(number%2==1)
					return false;

				number = number/2;
				
				count++;
				
		}

		//System.out.println(count);
		return true;
	}

}
