abstract class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    abstract void accountInfo();
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(double initialBalance, double interestRate) {
        super(initialBalance);
        this.interestRate = interestRate;
    }

    void accountInfo() {
        System.out.println("Savings Account Balance: rupees " + getBalance());
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

public class BankDemo {
    public static void main(String[] args) {
        SavingsAccount myAccount = new SavingsAccount(5000, 3.5);
        myAccount.accountInfo();
    }
}
