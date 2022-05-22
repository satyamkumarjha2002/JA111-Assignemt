package com.masai;

public class Account {
private int accountId;
private String accountType;
private int balance;
public boolean withdraw(int amount) {
	if(this.balance>=amount) {
		this.balance=this.balance-amount;
		System.out.println("Balance amount after withdraw : "+this.balance);
		return true;
	}
	System.out.println("Sorry Not Enough Balance");
	return false;
}
public void setId(int id) {
	this.accountId=id;
}
public void setAccountType(String type) {
	this.accountType=type;
}
public  void setBalance(int balance) {
	this.balance=balance;
}
}
