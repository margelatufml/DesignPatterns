package Subiect01;

public class FuleDecorator extends Decorator{
    public FuleDecorator(IRental decoratedRental) {
        super(decoratedRental);
    }

    @Override
    public Integer getCost() {
        return super.getCost()+200;
    }

    @Override
    public void getdescription() {
        super.getdescription(); System.out.println("200 fuleprice ");
    }
}
