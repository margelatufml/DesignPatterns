package subiect7;

public class Main {

    public static void main(String[] args) {
        Cart cart1 = new Cart();
        cart1.addItem(new CarItem("Sneakers", 120.0, 1));
        cart1.addItem(new CarItem("Socks", 10.0, 2));

        Client alice = new Client("alice123", "Str. Exemplu 1, București");
        Client bob   = new Client("bob456",   "Str. Exemplu 2, Cluj");

        // Magazia originală
        ICheckoutService magazin = new Magazin();

        // Decorator pentru reducere la prima comandă
        ICheckoutService checkoutWithDiscount =
                new FirstOrderDiscountDecorator(magazin);

        // Prima comandă a lui Alice – discount aplicat
        double totalAlice1 = checkoutWithDiscount.calculatetotal(cart1, alice);
        System.out.printf("Total Alice #1: %.2f RON%n", totalAlice1);

        // A doua comandă a lui Alice – fără discount
        double totalAlice2 = checkoutWithDiscount.calculatetotal(cart1, alice);
        System.out.printf("Total Alice #2: %.2f RON%n", totalAlice2);

        // Prima comandă a lui Bob – discount aplicat
        double totalBob1 = checkoutWithDiscount.calculatetotal(cart1, bob);
        System.out.printf("Total Bob #1:   %.2f RON%n", totalBob1);
    }


}
