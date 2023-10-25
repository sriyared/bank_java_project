package com.amdocs.bankaccount;

public class BankAccount {
	private double balance;
    static
    {
    	System.out.println("BANK ACCOUNT IS CREATED");
    }
	public BankAccount(double balance) {
		this.balance=balance;
		System.out.println("Account created with initial balance of:" +balance);
		// TODO Auto-generated constructor stub
	}
	public void deposit(double amount)
	{
		this.balance=this.balance+amount;
		System.out.println("After depositing your balance :" +this.balance);
	}
	public void withdraw(double amount)
	{
		if(amount<=this.balance)
		{
			this.balance-=amount;
			System.out.println("Amount withdrawing your balance is:"+this.balance);
		}
		else
		{
			System.out.println("Invalid");
		}
	}
	public double getbalance()
	{
		return this.balance;
	}
	public double checkBalance()
	{
		System.out.println("Balance is "+this.balance);
		return balance;
	}
	public void transfer(double amount,BankAccount b1)
	{
		if(amount<=this.balance)
		{
			this.withdraw(amount);
			b1.deposit(amount);
			System.out.println("Amount transferred");
		}
		else
		{
			System.out.println("Insufficient balance");
		}
	}
}