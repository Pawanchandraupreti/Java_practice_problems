package Ques_51_to_60;

// Custom Exception with Bank Account

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

class BankAccount {
    private double balance;
    
    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Only " + balance + " available");
        }
        balance -= amount;
    }
}


public class ques55 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        try {
            account.withdraw(100);
        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
