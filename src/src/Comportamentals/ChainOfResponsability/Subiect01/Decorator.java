package Comportamentals.ChainOfResponsability.Subiect01;

public abstract class Decorator implements IRental{
    protected IRental decoratedRental;

    public Decorator(IRental decoratedRental) {
        this.decoratedRental = decoratedRental;
    }

    @Override
    public Integer getCost() {
        return decoratedRental.getCost();
    }

    @Override
    public void getdescription() {
        decoratedRental.getdescription();
    }
}
