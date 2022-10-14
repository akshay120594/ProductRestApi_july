import java.util.Objects;

public class Account 
{
	int accno,balance;
	
	// constructor is used to initialize non-static global variables
//public Account(int a, int b) 
//{
//	
//		accno = a;
//		balance = b;
//	}


//	
	// if method return type is class , then that method gives object of that class
	// here getAccount() method's return type is Account class
	// and hence , this method will return (give) Account class object

	static Account getAccount()
	{
		Account obj = new Account();
		return obj;
	}
	
	
	/* another way */
//	static Account getAccount1()
//	{
//			return new Account();
//	}
	
	// non-static -reference
	// static - class
	
	void deposit(int amount)
	{
		balance = balance + amount ;
	}

// toString() gives content of object
	public String toString() {
		return "Account [accno=" + accno + ", balance=" + balance + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(accno, balance);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		return accno == other.accno && balance == other.balance;
	}



	
	
}




