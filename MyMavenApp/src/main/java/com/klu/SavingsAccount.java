package com.klu;
public class SavingsAccount extends BankAccount {

public SavingsAccount(double balance) {
	super(balance);
}

public void calculateInterest() {
	double interest = balance * 0.05;
	System.out.println("Interest: " + interest);
	    }
}



