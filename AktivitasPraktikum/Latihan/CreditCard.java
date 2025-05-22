package Latihan;

public class CreditCard extends PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("CreditCard: Payment of " + amount + " processed in default currency (IDR).");
    }

    @Override
    public void processPayment(double amount, String currency) {
        System.out.println("CreditCard: Payment of " + amount + " processed in " + currency + ".");
    }
}
