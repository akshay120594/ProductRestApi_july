package abstraction;



public class A implements Cloneable 
{
	int no=10;

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		A other = (A) obj;
		return no == other.no;
	}



	public static void main(String[] args) throws Exception {
		
		A obj1 = new A();
		
		A obj2  =(A) obj1.clone();
		
			
		System.out.println(obj1==obj2);
		System.out.println(obj1.equals(obj2));// equals() of Object class 
		
		// is called , which does address comparison
		// using type casting , we create reference of child class
		// whenever class Object is there , do type casting
		
		obj1.no=30;
		
		System.out.println(obj1.no);
		System.out.println(obj2.no);
		
		
		Object ob=new Object();
		//ob.clone();
		
		// protected is available to all classes from same package
		// and outside of package , only to child class
		// must be called using object of Child class only
		
		
		
		
	}
}
