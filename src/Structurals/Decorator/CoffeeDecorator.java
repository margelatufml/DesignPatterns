public abstract class CoffeeDecorator implements ICoffee{
    protected ICoffee decoratedCoffeel;

    public CoffeeDecorator(ICoffee decoratedCoffeel) {
        this.decoratedCoffeel = decoratedCoffeel;
    }

    @Override
    public double getCost() {
        return decoratedCoffeel.getCost();
    }

    @Override
    public String getDescription() {
        return decoratedCoffeel.getDescription();
    }
}
