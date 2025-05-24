package Comportamentals.ChainOfResponsability.MagazineRezolvare;

import java.util.List;

public class Categorii implements IProdus{
    private String denumire;
    private List<IProdus> subcategorii;

    public Categorii(String denumire, List<IProdus> subcategorii) {
        this.denumire = denumire;
        this.subcategorii = subcategorii;
    }

    @Override
    public Integer getNrBucati() {
        Integer cantitate = 0;
        for(IProdus s: this.subcategorii){
            cantitate+=s.getNrBucati();
        }
        return cantitate;
    }

    @Override
    public void afisareDenumire() {
        System.out.println("Aceasta este cantitatea din categorie  "+ this.denumire);
        for(IProdus s: this.subcategorii){
            s.afisareDenumire();
        }
    }
}
