package com.bankingsystem;

public interface Loanable {
 boolean applyForLoan(double amount);
 double calculateLoanEligibility();
}