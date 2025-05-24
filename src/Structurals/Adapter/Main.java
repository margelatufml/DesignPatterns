//Adapter: permite compatibilitatea intre interfete diferite

public class Main {
    public static void main(String[] args) {
        NewPaymentGateway gateway = new NewPaymentGateway();
        IOldPaymentSystem paymentSystem = new PaymentAdapter(gateway);
        paymentSystem.makePayment("12345", 100.0);
    }
}