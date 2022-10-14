package methods;

public class Account 
{
	
	int accno, balance;
	
	private Account(int accno,int balance)
	{
		this.accno=accno;
		this.balance=balance;
	}

	static Account getAccount(int accno,int balance)
	{
		Account account = new Account(accno,balance);
		
		return account;
	}

	@Override
	public String toString() {
		return "Account [accno=" + accno + ", balance=" + balance + "]";
	}
	
	
	
}
