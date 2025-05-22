package Latihan;

public class BankTransfer extends PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("BankTransfer: Payment of " + amount + " processed in default currency (IDR).");
    }

    @Override
    public void processPayment(double amount, String currency) {
        System.out.println("BankTransfer: Payment of " + amount + " processed in " + currency + ".");
    }
}
