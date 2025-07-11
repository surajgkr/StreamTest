package com.aurionpro.customexception;

public class BankAccountTest {

	public static void main(String[] args) {
		

		BankAccount account = new BankAccount(1000);

		try {
			account.deposit(500); 
			account.withdraw(200); 
			account.withdraw(2000); 
			account.deposit(-100); 
			account.withdraw(0); 
		} catch (InsufficientFundsException | NegativeAmountException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

}
