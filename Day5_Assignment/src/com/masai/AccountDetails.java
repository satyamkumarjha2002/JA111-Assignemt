package com.masai;

import java.util.Scanner;

public class AccountDetails {
	Scanner input = new Scanner(System.in);
	public Account getAccountDetails() {
		
		Account account = new Account();
		System.out.println("Enter Account Id - ");
		account.setId(input.nextInt());
		System.out.println("Enter Account Type");
		account.setAccountType(input.next());
		System.out.println("Enter Balance - ");
		int balance=input.nextInt();
		while(balance<=0) {
			System.out.println("Balance should be Positive Enter Again -");
			balance=input.nextInt();
		}
		account.setBalance(balance);
		return account;
	}
	public int getWithdrawAmount() {
	   int withdrawAmount=0;
	   System.out.println("Enter Amount to be Withdrawn - ");
	   withdrawAmount=input.nextInt();
	   while(withdrawAmount<=0) {
		   System.out.println("Amount Should be positive Enter Again -");
		   withdrawAmount=input.nextInt();
	   }
		   return withdrawAmount;
	   
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccountDetails account=new AccountDetails();
		Account  user1=account.getAccountDetails();
		int withdrwalAmmount= account.getWithdrawAmount();
		user1.withdraw(withdrwalAmmount);
	}

}
