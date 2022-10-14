import java.util.Calendar;

public class TestAccount {

	public static void main(String[] args) throws Exception {
		
//Account obj = new Account();
Account obj = Account.getAccount();

// getAccount() gives us Account class object .
// obj is a reference which will point to that object.

//obj==>[accno=1 balance=1000] Account class object

System.out.println(obj);// toString() called

// whenever we print object reference , toString() is called automatically

obj.accno=1;
obj.balance=1000;

System.out.println(obj);// toString() called

Calendar.getInstance();

	}
}
