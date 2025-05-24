package Subiect06;

import java.util.List;

public class VerificareDisponibilitateRestaurant extends Handler{
    private String numeRestaurant;

    public VerificareDisponibilitateRestaurant(String numeRestaurant) {
        this.numeRestaurant = numeRestaurant;
    }

    @Override
    public List<Order> filtrare(List<Order> orderlistUnfiltered) {


        return super.filtrare(orderlistUnfiltered);
    }
}
