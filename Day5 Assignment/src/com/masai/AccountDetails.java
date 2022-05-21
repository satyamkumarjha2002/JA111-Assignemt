package com.masai;

import java.util.Scanner;

public class AccountDetails {
	Scanner input = new Scanner(System.in);
	Account setUserDetails = new Account();

	public Account getAccountDetails() {
		System.out.println("Enter Account Id:-");
		int accountId = input.nextInt();
		System.out.println("Enter Deposite Amount:-");
		int balance = input.nextInt();
		if (balance > 0) {
			int withdrawlAmount = getWithdrawAmount();
			System.out.println("Enter Account Type:-");
			String accounttype = input.next();
			setUserDetails.set(accountId);
			setUserDetails.set(accounttype);
			setUserDetails.setBlance(balance);
			setUserDetails.withdraw(withdrawlAmount);
		} else {
			System.out.println("Balance should be positive or greater than 0 Enter Again Acoount Details:-");
			getAccountDetails();
		}
		return null;
	}

	public int getWithdrawAmount() {
		System.out.println("Enter Withdrawal Amount:-");
		int withdrawn_balance = input.nextInt();
		return withdrawn_balance;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccountDetails user1 = new AccountDetails();
		user1.getAccountDetails();
	}

}
