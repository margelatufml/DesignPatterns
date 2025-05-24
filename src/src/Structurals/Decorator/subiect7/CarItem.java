package Structurals.Decorator.subiect7;

public class CarItem {
    private final String name;
    private final double unitPrice;
    private final Integer quantity;

    public CarItem(String name, double unitPrice, Integer quantity) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public double getTotalPrice(){
        return unitPrice * quantity;
    }
}
