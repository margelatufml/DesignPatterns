public class Milkdecorator extends CoffeeDecorator{
    public Milkdecorator(ICoffee decoratedCoffeel) {
        super(decoratedCoffeel);
    }

    @Override
    public double getCost() {
        return super.getCost()+1.5;
    }

    @Override
    public String getDescription() {
        return super.getDescription()+", cu lapte";
    }
}
