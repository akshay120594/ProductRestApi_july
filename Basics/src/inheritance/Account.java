package inheritance;

public class Account 
{
	
	int accno, balance;
	
	public Account(int accno,int balance)
	{
		this.accno=accno;
		this.balance=balance;
	}

	@Override
	public String toString() {
		return "Account [accno=" + accno + ", balance=" + balance + "]";
	}
// Account a1=new Account(1,1000)
// Account a2=new Account(1,1000)
// method signature - name & argument
// Overriding - same signature
// this,a1== > [accno=1,balance=1000 equals()] Account object
// o , a2, account ==> [accno=1,balance=1000] Account object
// a1.equals(a2)
// whenever we have reference of Parent and object of Child , do type casting ( type change )
// a1.equals("JBK")
	
	@Override
	public boolean equals(Object o)
	{
		 	// equals("JBK")
			// o==> ("JBK") String class object
			// o instanceof Account  . object pointed by o , is it instance of Account class
			
			if(o==null)
			{
				return false;
			}
			
			else if(!(o instanceof Account))
			{
				return false;
			}
			
			else
			{
				Account account2=(Account)o;
		 		 	
				if(this.accno == account2.accno && this.balance==account2.balance)
				{
					return true;
				}
				
				else
				{
					return false;
				}
		
			}
	// this points to that object which is used for calling method
	
	//System.out.println(a1.equals(a2));
	
	
		}//equals()
}//class Account
