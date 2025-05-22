package Latihan;
public class Main {
    public static void main(String[] args) {
        PaymentMethod[] payments = new PaymentMethod[3];

        payments[0] = new CreditCard();
        payments[1] = new EWallet();
        payments[2] = new BankTransfer();

        System.out.println("=== Pembayaran Default Currency ===");
        for (PaymentMethod pm : payments) {
            pm.processPayment(500000); // menggunakan method override
        }

        System.out.println("\n=== Pembayaran dengan Spesifikasi Mata Uang ===");
        String[] currencies = {"USD", "EUR", "IDR"};
        double[] amounts = {50, 100, 150};

        for (int i = 0; i < payments.length; i++) {
            payments[i].processPayment(amounts[i], currencies[i]); // menggunakan method overload
        }
    }
}
