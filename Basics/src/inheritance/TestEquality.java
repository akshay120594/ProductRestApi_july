package inheritance;

public class TestEquality {

	public static void main(String[] args) {
		
		
		Account a1=new Account(1,10000);
		
		// a1(1000) ===> [accno=1 balance=10000] Account class object at address 1000
		
		Account a2=new Account(1,10000);
		
		// a2(2000) ===> [accno=1 balance=10000] Account class object at address 2000


		
		System.out.println(a1.equals(null));
		System.out.println(a1.equals("JBK"));

		System.out.println(a1==a2);
		System.out.println(a1.equals(a2));
		
		// Object class's equals() compare address

		
	}

}
