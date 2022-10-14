package polymorphism;

public class Account {
	
	int accno, balance;

	
	public Account(int accno, int balance) {
		super();
		this.accno = accno;
		this.balance = balance;
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(new Account(1,1000));
	}

}
