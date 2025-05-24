package subiect7;

import java.util.HashSet;
import java.util.Set;

public class FirstOrderDiscountDecorator implements ICheckoutService{
    private final ICheckoutService wrappedService;
    private final Set<String> clientsWithDiscount=new HashSet<>();

    public FirstOrderDiscountDecorator(ICheckoutService wrappedService) {
        this.wrappedService = wrappedService;
    }

    @Override
    public double calculatetotal(Cart cart, Client client) {
        double total=wrappedService.calculatetotal(cart,client);

        if(!clientsWithDiscount.contains(client.getId())){
            clientsWithDiscount.add(client.getId());
            total=total*0.90; // aplicam 10% reducere
            System.out.println("Applied 10% first-order discount for client "+ client.getId());
        }
        return total;
    }
}
