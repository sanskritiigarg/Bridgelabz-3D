package com.bankingsystem;

public class CurrentAccount extends BankAccount implements Loanable {
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, String holderName, double initialBalance) {
        super(accountNumber, holderName, initialBalance);
        this.overdraftLimit = 500.00;
    }
    
    @Override
    public double calculateInterest() {
        return 0.0;
    }
    
    @Override
    public void withdraw(double amount) {
        if (amount > 0 && (getBalance() + overdraftLimit) >= amount) {
            super.withdraw(amount);
        } else {
            System.out.println("Withdrawal amount exceeds overdraft limit.");
        }
    }

    @Override
    public boolean applyForLoan(double amount) {
        if (amount <= calculateLoanEligibility()) {
            System.out.printf("Loan application for $%.2f approved!%n", amount);
            return true;
        } else {
            System.out.printf("Loan application for $%.2f denied. Exceeds eligibility of $%.2f.%n", amount, calculateLoanEligibility());
            return false;
        }
    }

    @Override
    public double calculateLoanEligibility() {
        return getBalance() * 5;
    }
}