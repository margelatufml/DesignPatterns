package Comportamentals.ChainOfResponsability.Subiect01;

public class SecurityDecorator extends Decorator{
    public SecurityDecorator(IRental decoratedRental) {
        super(decoratedRental);
    }

    @Override
    public Integer getCost() {
        return super.getCost() + 150;
    }

    @Override
    public void getdescription() {
        super.getdescription();
        System.out.println("150 securityCosts ");
    }
}
