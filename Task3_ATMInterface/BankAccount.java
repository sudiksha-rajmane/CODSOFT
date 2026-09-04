package CCODSOFT;
public class BankAccount {

    private double balance;

    // Constructor
    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    // Check balance
    public double getBalance() {
        return balance;
    }

    // Deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("₹" + amount + " deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdraw money
    public boolean withdraw(double amount) {

        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
            return false;
        }

        if (amount > balance) {
            System.out.println("Insufficient balance.");
            return false;
        }

        balance -= amount;
        System.out.println("₹" + amount + " withdrawn successfully.");
        return true;
    }
}
