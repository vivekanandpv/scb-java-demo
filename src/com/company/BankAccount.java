package com.company;

public class BankAccount implements Account {
	private double balance;
	
	//	constructor
	public BankAccount(double balance) {
		this.balance = balance;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= amount;
	}

	public double getBalance() {
		return balance;
	}
}
