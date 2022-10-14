
/* In Shallow clonning , clonning of ONLY primitive is done 
 * In Deep clonning , clonning of Primitive and non-primitive both are done .
 *  */
public class A implements Cloneable {

	
	int no=10;
	String name="JBK";// dependant object


	public static void main(String[] args) throws Exception {
		
		
		A obj1 = new A();//  obj1 ==>[name="JavaByKiran"] A class object at address 1000
		
		A obj2 = (A) obj1.clone();//  obj2 ==>[name="JBK"] A class object at address 2000
		
		System.out.println(obj1==obj2);
		System.out.println(obj1.equals(obj2));
	
	
			obj1.name="JAVABYKIRAN";
			
			System.out.println(obj1);
			
			System.out.println(obj2);
	}
	
	
	
	@Override
	public String toString() {
		return "A [no=" + no + ", name=" + name + "]";
	}

}
