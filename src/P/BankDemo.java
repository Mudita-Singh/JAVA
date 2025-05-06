package P;

// Bank interface with deposit and withdraw methods
interface Bank {
    void deposit(double amount);
    void withdraw(double amount);
}

// Account class implementing Bank interface
class Account implements Bank {
    private double balance;

    // Constructor
    Account(double initialBalance) {
        this.balance = initialBalance;
    }

    // Implementing deposit method
    public void deposit(double amount) {

            System.out.println("Deposited: Rupees" + amount);

    }

    // Implementing withdraw method
    public void withdraw(double amount) {

            System.out.println("Withdrawn: Rupees" + amount);

    }

    // Method to display balance
    void displayBalance() {
        System.out.println("Current Balance: Rupees" + balance);
    }
}

// Main class
public class BankDemo {
    public static void main(String[] args) {
        Account myAccount = new Account(5000); // Initial balance ₹5000

        myAccount.displayBalance();
        myAccount.deposit(2000);  // Deposit ₹2000
        myAccount.withdraw(1500); // Withdraw ₹1500
        myAccount.withdraw(6000); // Withdraw ₹6000 (Invalid)
        myAccount.displayBalance();
    }
}
