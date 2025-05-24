package Comportamentals.ChainOfResponsability.MagazineRezolvare;

import MagazineRezolvare.Produs;

import java.util.ArrayList;
import java.util.List;

public class PriceFilter extends FilterHandler{
    private final Float pretMaxim;

    public PriceFilter(Float pretMaxim) {
        this.pretMaxim = pretMaxim;
    }

    @Override
    protected List<Produs> applyFilter(List<Produs> produse) {
        List<Produs> results=new ArrayList<>();
        if(this.pretMaxim==null){
            return produse;
        }
        for(Produs p:produse){
            if(p.getPret()<=pretMaxim){
                results.add(p);
            }
        }
        return results;
    }
}
