package Ques_61_to_70;

// Strategy Pattern

interface PaymentStrategy {
    void pay(double amount);
}

class CreditCardPayment implements PaymentStrategy {
    public void pay(double amount) {
        System.out.printf("Paid $%.2f via Credit Card\n", amount);
    }
}

class PayPalPayment implements PaymentStrategy {
    public void pay(double amount) {
        System.out.printf("Paid $%.2f via PayPal\n", amount);
    }
}

class ShoppingCart {
    private PaymentStrategy strategy;
    
    public void setStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }
    
    public void checkout(double amount) {
        strategy.pay(amount);
    }
}

public class ques67 {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.setStrategy(new CreditCardPayment());
        cart.checkout(99.99);
    }
}
