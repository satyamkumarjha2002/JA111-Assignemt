package com.masai;

public class Account {
private int accountid;
private int balance;
private String accountType;
public void set(int input) {
	this.accountid=input;
}
public void set(String type) {
	this.accountType=type;
}
public void setBlance(int baln) {
	this.balance=baln;
}
public boolean withdraw(int amount) {
	if(amount<balance) {
		this.balance=balance-amount;
		System.out.println("Balance amount after withdraw: "+balance);
		return true;
	}
	System.out.println( "Sorry!!! No enough balance");
	return false;
}
}
