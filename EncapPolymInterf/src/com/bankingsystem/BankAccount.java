package com.bankingsystem;


public abstract class BankAccount {
 private String accountNumber;
 private String holderName;
 private double balance;

 public BankAccount(String accountNumber, String holderName, double initialBalance) {
     this.accountNumber = accountNumber;
     this.holderName = holderName;
     this.balance = initialBalance;
 }
 
 public abstract double calculateInterest();

 public void deposit(double amount) {
     if (amount > 0) {
         balance += amount;
         System.out.printf("Deposited: $%.2f. New Balance: $%.2f%n", amount, balance);
     } else {
         System.out.println("Deposit amount must be positive.");
     }
 }

 public void withdraw(double amount) {
     if (amount > 0 && amount <= balance) {
         balance -= amount;
         System.out.printf("Withdrew: $%.2f. New Balance: $%.2f%n", amount, balance);
     } else {
         System.out.println("Invalid withdrawal amount or insufficient funds.");
     }
 }
 
 public void displayAccountInfo() {
     System.out.println("Account Number: " + accountNumber);
     System.out.println("Account Holder: " + holderName);
     System.out.printf("Current Balance: $%.2f%n", balance);
 }
 

 public String getAccountNumber() {
     return accountNumber;
 }
 
 public String getHolderName() {
     return holderName;
 }

 public double getBalance() {
     return balance;
 }
}