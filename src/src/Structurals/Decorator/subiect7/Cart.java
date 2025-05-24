package Structurals.Decorator.subiect7;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private final List<CarItem> items=new ArrayList<>();

    public void addItem(CarItem item){
        this.items.add(item);
    }

    public double getSubtotal(){
        return items.stream().mapToDouble(CarItem::getTotalPrice).sum();
    }
}
