package MagazineRezolvare;

import MagazineRezolvare.Produs;

import java.util.List;

public class Subcategorii implements IProdus {
    private String denumire;
    private List<Produs> produse;

    public Subcategorii(String denumire, List<Produs> produse) {
        this.denumire = denumire;
        this.produse = produse;
    }

    @Override
    public Integer getNrBucati() {
        Integer cantitate = 0;
        for(Produs s: this.produse){
            cantitate+=s.getNrBucati();
        }
        return cantitate;
    }

    @Override
    public void afisareDenumire() {
    System.out.println("Aceasta subcategorie este denumite "+this.denumire+" \n");
    }
}
