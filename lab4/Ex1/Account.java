package com.capg.lab4.Ex1;

public class Account {
	long AccNum;
	double balance;
	Person accHolder;
	
	public long getAccNum() {
		return AccNum;
	}
	public void setAccNum(long accNum) {
		this.AccNum = accNum;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Person getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}
	public void deposit(double depositamt) {
		double bal=balance+depositamt;
		setBalance(bal);
	}
	public void withdraw(double withdrawamt) {
		double bal=balance-withdrawamt;
		setBalance(bal);
	}
	public double getBalance(double balance) {
		return balance;
	}
	
}
