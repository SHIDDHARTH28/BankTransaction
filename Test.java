package com.niit.banktrans;

public class Test {

	public static void main(String[] args) {
		Account a=new Account(1001, 10000);
		
		DepositThread d;
		WithdrawThread w;
		
		d=new DepositThread(a, 1000);
		d.start();
		
		w=new WithdrawThread(a, 2000);
		w.start();
		
		d=new DepositThread(a, 3000);
		d.start();
		
		w= new WithdrawThread(a,4000);
		w.start();
		

	}

}
