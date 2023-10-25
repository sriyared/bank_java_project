package com.amdocs.bankaccount;

public class Tester {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     BankAccount b1=new BankAccount (500);
     BankAccount b2=new BankAccount (300);
     b1.withdraw(200);
     b1.deposit(1000);
     b1.transfer(500,b2);
     b1.checkBalance();
     
     SavingsAccount s1=new SavingsAccount(2000);
     s1.deposit(500);
     s1.checkBalance();
    
     CurrentAccount c1=new CurrentAccount(200);
     c1.deposit(500);
     c1.withdraw(100);
     c1.transfer(500,s1);
     c1.checkBalance();
     s1.checkBalance();
	}

}
