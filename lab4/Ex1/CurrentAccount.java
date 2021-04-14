package com.capg.lab4.Ex1;

public class CurrentAccount extends Account{
	final double overdraftlimit=1500;
	public void withdraw(double withdrawamt) {
		double bal;
		bal=Math.abs(balance-withdrawamt);
		if(bal<=overdraftlimit) {
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
	}
	
}
