package Comportamentals.ChainOfResponsability.Subiect06;

import java.util.List;

public class Handler implements IOrderValidator{
    protected Handler next;


    public void setNext(Handler next) {
        this.next = next;
    }

    @Override
    public List<Order> filtrare(List<Order> orderlistUnfiltered) {
        return List.of();
    }
}
