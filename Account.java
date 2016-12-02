package com.niit.banktrans;

public class Account {
	private int accountnumber;
	private double balance;
	
	public Account(int accountnumber, double balance)
	{
		this.accountnumber=accountnumber;
		this.balance=balance;
		
	}
	public synchronized void deposit(int amount)
	{
		balance=balance+amount;
		System.out.println("After deposit "+ amount+" The balance is: "+balance);
	}
	
	public synchronized void withdraw(int amount)
	{
		balance=balance-amount;
		System.out.println("After withdraw "+ amount+" The balance is: "+balance);
	}
	

}
