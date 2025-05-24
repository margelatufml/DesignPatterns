package Structurals.Decorator;

public class SugarDecorator extends CoffeeDecorator{
    public SugarDecorator(ICoffee decoratedCoffeel) {
        super(decoratedCoffeel);
    }

    @Override
    public double getCost() {
        return super.getCost()+0.5;
    }

    @Override
    public String getDescription() {
        return super.getDescription()+", cu zahar";
    }
}
