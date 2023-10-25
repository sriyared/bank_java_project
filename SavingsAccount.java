package com.amdocs.bankaccount;

public class SavingsAccount extends BankAccount {
	private double interest;
    public SavingsAccount(double amount) {
		super(amount);
	}
    public void deposit(double amount)
    {
    	interest=amount*0.03;
    	System.out.println("You got 3% interest on your deposit:");
    	super.deposit(amount+interest);
    }
}
