package Ques_31_to_40;

//Thread-safe banking simulation with synchronized methods

class BankAccount {
    private double balance;
    
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }
    
    public synchronized void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + " | New Balance: " + balance);
    }
    
    public synchronized void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew: " + amount + " | New Balance: " + balance);
        } else {
            System.out.println("Insufficient funds for withdrawal: " + amount);
        }
    }
}


public class ques31 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);
        
        new Thread(() -> account.deposit(500)).start();
        new Thread(() -> account.withdraw(200)).start();
        new Thread(() -> account.withdraw(1500)).start();
    }
}
