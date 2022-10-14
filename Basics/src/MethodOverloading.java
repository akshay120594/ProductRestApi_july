
public class MethodOverloading {

	
	static void add(int a,int b)
	{
		System.out.println(a+b);
	}
	
	static void add(float a,float b)
	{
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		
		add(10,'a');
		add(3.4f,12);// method call
	
		
	// char -- int
	// byte - short - int - long - float - double
		
	float d=3.7f;
	System.out.println(d);
	
	int k=(int)d;
	System.out.println(k);
	
	double o=d;
	System.out.println(o);
	
	
	long mobno=9898998;// implicit casting int is converted into long
	float p=mobno;
	
	System.out.println(p);
	
	
	long u=989898989899899L;
	System.out.println(u);
	
	int q=(int)2147483648L;
	System.out.println(q);
	
	

		
		

	}

}
