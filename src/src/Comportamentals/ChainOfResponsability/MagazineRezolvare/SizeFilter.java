package Comportamentals.ChainOfResponsability.MagazineRezolvare;

import MagazineRezolvare.Produs;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class SizeFilter extends  FilterHandler{
    private final Float size;

    public SizeFilter(Float size) {
        this.size = size;
    }

    @Override
    protected List<Produs> applyFilter(List<Produs> produse) {
        List<Produs> results=new ArrayList<>();
        if(this.size==null){
            return produse;
        }
        for(Produs p: produse){
            if(Objects.equals(p.getMarime(), size)){
                results.add(p);
            }
        }
        return results;
    }
}
