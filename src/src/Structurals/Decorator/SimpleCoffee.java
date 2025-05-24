package Structurals.Decorator;

public class SimpleCoffee implements ICoffee {
    @Override
    public double getCost() {
        return 5.0;
    }

    @Override
    public String getDescription() {
        return "Cafea simpla";
    }
}
