package Latihan;

public class EWallet extends PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("EWallet: Payment of " + amount + " processed in default currency (IDR).");
    }

    @Override
    public void processPayment(double amount, String currency) {
        System.out.println("EWallet: Payment of " + amount + " processed in " + currency + ".");
    }
}
