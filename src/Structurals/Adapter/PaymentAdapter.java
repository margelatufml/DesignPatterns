public class PaymentAdapter implements IOldPaymentSystem{
    private NewPaymentGateway gateway;

    public PaymentAdapter(NewPaymentGateway gateway) {
        this.gateway = gateway;
    }

    @Override
    public void makePayment(String accountNumber, double amount) {
        String customerId=accountNumber;
        String paymentDetails=" Card credit";
        gateway.processPayment(customerId,paymentDetails,amount);
    }
}
