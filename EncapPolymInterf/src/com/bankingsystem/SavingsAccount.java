package com.bankingsystem;

public class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, String holderName, double initialBalance) {
        super(accountNumber, holderName, initialBalance);
        this.interestRate = 0.04;
    }

    @Override
    public double calculateInterest() {
        return getBalance() * interestRate;
    }
}