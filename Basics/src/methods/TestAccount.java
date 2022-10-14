package methods;

import java.util.Scanner;

public class TestAccount {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter account number :-  ");
		
		int accno=scanner.nextInt();
		
		System.out.println("Enter balance :-  ");
		
		int balance=scanner.nextInt();
		
		//getAccount(1,1000);
		
		System.out.println(Account.getAccount(accno,balance));//toString()
		
		System.out.println(Account.getAccount(accno,balance).toString());
	}

}
