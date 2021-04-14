package com.capg.lab4.Ex1;

public class AccountMain {

	public static void main(String[] args) {
		Account acSm=new SavingsAccount();
		Account acKt=new SavingsAccount();
		Account accopySm=new CurrentAccount();
		Person p=new Person();
		Person p1=new Person();
		acSm.setBalance(2000);
		p.setName("smith");
		p1.setName("Kathy");
		acKt.setBalance(3000);
		acSm.deposit(2000);
		acKt.withdraw(2000);
		System.out.println("Smith account balance"+acSm.getBalance());
		System.out.println("Kathy account balance"+acKt.getBalance());
		acSm.withdraw(3000);
		System.out.println("Smith account balance is:"+acSm.getBalance());
		accopySm.setBalance(2000);
		accopySm.withdraw(3501);
			
	}

}
