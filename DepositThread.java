package com.niit.banktrans;

public class DepositThread extends Thread {
	Account account;
	int amount;
	public DepositThread(Account account, int amount)
	{
		this.account=account;
		this.amount=amount;
	}
	
	public void run()
	{
		account.deposit(amount);
	}

}
