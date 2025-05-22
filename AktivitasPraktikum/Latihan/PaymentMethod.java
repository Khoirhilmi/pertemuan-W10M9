package Latihan;

public class PaymentMethod {
    public void processPayment(double amount) {
        System.out.println("Processing payment of amount: " + amount + " in default currency (IDR).");
    }

    public void processPayment(double amount, String currency) {
        System.out.println("Processing payment of amount: " + amount + " in currency: " + currency);
    }
}
