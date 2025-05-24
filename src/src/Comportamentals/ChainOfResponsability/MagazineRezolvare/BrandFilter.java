package Comportamentals.ChainOfResponsability.MagazineRezolvare;

import Comportamentals.ChainOfResponsability.MagazineRezolvare.Produs;

import java.util.ArrayList;
import java.util.List;

public class BrandFilter extends FilterHandler{
    private final String brand;
    @Override
    protected List<Produs> applyFilter(List<Produs> produse) {

        if(brand==null || brand.isEmpty()){
            return produse;
        }
        List<Produs> result=new ArrayList<>();
        for(Produs p : produse){
            if(p.getNume().equals(brand)){
                result.add(p);
            }
        }

        return result;
    }

    public BrandFilter(String brand) {
        this.brand = brand;
    }
}
