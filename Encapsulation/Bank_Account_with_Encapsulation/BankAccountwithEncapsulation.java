package Encapsulation.Bank_Account_with_Encapsulation;

class BankAccount {
    // Step 1: Private variables (data is hidden)
    private String accountHolder;
    private double balance;

    // Step 2: Constructor
    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Step 3: Getter method (read-only access)
    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    // Step 4: Setter method (controlled modification)
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }
}

public class BankAccountwithEncapsulation {
    public static void main(String[] args) {
        // Create object
        BankAccount acc = new BankAccount("Rahul", 5000);

        // Access data safely through methods
        System.out.println("Account Holder: " + acc.getAccountHolder());
        System.out.println("Initial Balance: " + acc.getBalance());

        acc.deposit(1500);
        System.out.println("Updated Balance: " + acc.getBalance());

        acc.withdraw(2000);
        System.out.println("Final Balance: " + acc.getBalance());
    }
}
