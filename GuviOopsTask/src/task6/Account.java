package task6;

import java.util.Scanner;

public class Account {
    
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    
    public Account() {
        this.accountNumber = "000000";
        this.accountHolderName = "Default User";
        this.balance = 0.0;
    }

    
    public Account(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid or insufficient balance for withdrawal.");
        }
    }

    
    public void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }

    
    public void displayAccountInfo() {
        System.out.println("\nAccount Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter Account Number: ");
        String accNum = scanner.nextLine();

        System.out.print("Enter Account Holder Name: ");
        String accName = scanner.nextLine();

        System.out.print("Enter Initial Balance: ");
        double initBalance = scanner.nextDouble();

        Account acc = new Account(accNum, accName, initBalance);
        acc.displayAccountInfo();

        
        System.out.print("\nEnter amount to deposit: ");
        double depositAmt = scanner.nextDouble();
        acc.deposit(depositAmt);
        acc.checkBalance();

        System.out.print("\nEnter amount to withdraw: ");
        double withdrawAmt = scanner.nextDouble();
        acc.withdraw(withdrawAmt);
        acc.checkBalance();

        
    }
}