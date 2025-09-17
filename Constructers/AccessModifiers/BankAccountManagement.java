class BankAccount {
    public String accountNumber;
    protected String accountHolder;
    private double balance;

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    public void displaySavingsAccountInfo() {
        System.out.println("--- Savings Account Details ---");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + getBalance());
        System.out.println("Interest Rate: " + interestRate);
    }
}

public class BankAccountManagement {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456789", "John Doe", 5000.0);
        System.out.println("--- Bank Account Details ---");
        account.displayAccountInfo();
        account.deposit(1000);
        System.out.println("Balance after deposit: " + account.getBalance());
        account.withdraw(500);
        System.out.println("Balance after withdrawal: " + account.getBalance());
        System.out.println();

        SavingsAccount savings = new SavingsAccount("987654321", "Jane Smith", 10000.0, 2.5);
        savings.displaySavingsAccountInfo();
    }
}
