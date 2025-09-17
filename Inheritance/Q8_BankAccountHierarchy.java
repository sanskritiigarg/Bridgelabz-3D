class BankAccount {
    String accNo;
    public BankAccount(String accNo) { this.accNo = accNo; }
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(String accNo) { super(accNo); }
    public void type() { System.out.println(accNo + " is Savings Account"); }
}

class CheckingAccount extends BankAccount {
    public CheckingAccount(String accNo) { super(accNo); }
    public void type() { System.out.println(accNo + " is Checking Account"); }
}

class FixedDepositAccount extends BankAccount {
    public FixedDepositAccount(String accNo) { super(accNo); }
    public void type() { System.out.println(accNo + " is Fixed Deposit Account"); }
}

public class Q8_BankAccountHierarchy {
    public static void main(String[] args) {
        new SavingsAccount("S01").type();
        new CheckingAccount("C01").type();
        new FixedDepositAccount("F01").type();
    }
}
