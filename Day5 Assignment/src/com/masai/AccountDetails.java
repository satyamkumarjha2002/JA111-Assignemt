package com.masai;

import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

public class AccountDetails {
	Scanner input = new Scanner(System.in);
	Account setUserDetails = new Account();

	public Account getAccountDetails() {
		System.out.println("Enter Account Id:-");
		int accountId = input.nextInt();
		int balance=-1;
		while(balance<=0) {
			System.out.println("Enter Balance:-");
			balance = input.nextInt();
			if(balance<=0)
			System.out.println("Balance should be positive and non-zero");
		}
		int withdrawlAmount = getWithdrawAmount();
		System.out.println("Enter Account Type:-");
		String accounttype = input.next();
		setUserDetails.set(accountId);
		setUserDetails.set(accounttype);
		setUserDetails.setBlance(balance);
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
		int withtdrw_amount = user1.getWithdrawAmount();
		user1.setUserDetails.withdraw(withtdrw_amount);
	}

}
