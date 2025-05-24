package Comportamentals.ChainOfResponsability.MagazineRezolvare;

import MagazineRezolvare.Produs;

import java.util.List;

public abstract class FilterHandler {
    protected FilterHandler next;

    public FilterHandler setnext(FilterHandler next) {
        this.next = next;
        return next;
    }

    public List<Produs> handle(List<Produs> produse){
        List<Produs> filtrate=applyFilter(produse);
        return (next!=null)? next.handle(filtrate):filtrate;
    }

    protected abstract List<Produs> applyFilter(List<Produs> produse);
}
