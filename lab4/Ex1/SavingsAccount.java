package com.capg.lab4.Ex1;

public class SavingsAccount extends Account {
	final double minbalance=500;
	public void withdraw(double withdrawamt) {
		double bal=balance-withdrawamt;
		if(bal>minbalance) {
			setBalance(bal);
		}
		else {
			System.out.println("Account Balance Low transaction cannot take place");
		}
	}
}
