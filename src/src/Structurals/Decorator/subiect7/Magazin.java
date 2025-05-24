package Structurals.Decorator.subiect7;

public class Magazin implements ICheckoutService{
    @Override
    public double calculatetotal(Cart cart, Client client) {
        double subtotal=cart.getSubtotal();
        double shipping=computeShipping(subtotal,client.getAddress());
        return subtotal+shipping;
    }

    private double computeShipping(double subtotal, String address) {
        // Exemplu simplificat: livrare gratuită peste 100 RON, altfel 20 RON
        if (subtotal >= 100.0) {
            return 0.0;
        }
        return 20.0;
    }
}
