package com.amdocs.bankaccount;

public class CurrentAccount extends BankAccount {
	static
	{
		System.out.println("CURRENT ACCOUNT IS CREATED");
	}

	public CurrentAccount(double amount) {
		super(amount);
	}
	public void withdraw(double amount)
	{
		if(amount<=getbalance())
		{
		   System.out.println("Rs.200 is deducted on your withdrawl for current");
		   super.withdraw(amount+200);
        }		
		else
		{
			System.out.println("Insufficient amount for withdraw");
		}
	}
} 
