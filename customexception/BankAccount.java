package com.aurionpro.customexception;

public class BankAccount {
	
	private double balance;

	public BankAccount(double balance) {
		this.balance = balance;
	}

	public void deposit(double amount) throws NegativeAmountException {
		if (amount <= 0) {
			throw new NegativeAmountException("Cannot deposit zero or negative amount.");
		}
		balance += amount;
		System.out.println("Deposited: " + amount + " | New Balance: " + balance);
	}

	public void withdraw(double amount) throws InsufficientFundsException, NegativeAmountException {
		if (amount <= 0) {
			throw new NegativeAmountException("Cannot withdraw zero or negative amount.");
		}
		if (amount > balance) {
			throw new InsufficientFundsException("Insufficient funds for withdrawal.");
		}
		balance -= amount;
		System.out.println("Withdrawn: " + amount + " | Remaining Balance: " + balance);
	}

	public double getBalance() {
		return balance;
	}
}
