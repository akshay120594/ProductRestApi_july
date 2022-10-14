
public class TestA {

	public static void main(String[] args) {
		
		//A obj1=new A();
		
		A obj1=A.getObject();
	
		A obj2=A.getObject();
		
		System.out.println(obj1==obj2);
	}
}
