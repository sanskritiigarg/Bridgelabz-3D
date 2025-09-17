package com.bankingsystem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<BankAccount> accounts = new ArrayList<>();
        
        accounts.add(new SavingsAccount("SA-1001", "Charlie", 5000));
        accounts.add(new CurrentAccount("CA-2002", "Diana", 10000));
        
        for (BankAccount account : accounts) {
            account.displayAccountInfo();
            account.deposit(500);
            
            double interest = account.calculateInterest();
            System.out.printf("Calculated Annual Interest: $%.2f%n", interest);

            if (account instanceof Loanable) {
                Loanable loanAccount = (Loanable) account;
                System.out.printf("Loan Eligibility: $%.2f%n", loanAccount.calculateLoanEligibility());
                loanAccount.applyForLoan(40000); 
                loanAccount.applyForLoan(60000); 
            }
            System.out.println("======================================");
        }
    }
}