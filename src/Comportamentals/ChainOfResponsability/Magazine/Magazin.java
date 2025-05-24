package Magazine;

import java.util.List;

public class Magazin implements ICautare{
    private String name;
    private Brand filtrareBrand;
    private Marime filtraremarime;
    private Pret filtrarePret;
    private Handler bufferFiltrare=new Handler() {};
    private String nume;
    private Float pret;
    private Integer marime;

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setPret(Float pret) {
        this.pret = pret;
    }

    public void setMarime(Integer marime) {
        this.marime = marime;
    }

    public Magazin(String name) {
        this.name = name;
    }
    public void cautare(List<Produs> produseinitiale){
        bufferFiltrare.setProduseRamase(produseinitiale);
      bufferFiltrare.setNext(filtrareBrand);
      filtrareBrand.setNext(filtraremarime);
      filtraremarime.setNext(filtrarePret);
//      bufferFiltrare.cautare(this.name);
      System.out.println("Acestea sunt produsele ramase dupa filtrare");
      for(Produs produs:bufferFiltrare.getProduseRamase()){
          System.out.println("produs: " + produs.toString());
      }

    }

    public void setFiltrareBrand(Brand filtrareBrand) {
        this.filtrareBrand = filtrareBrand;
    }

    public void setFiltrarePret(Pret filtrarePret) {
        this.filtrarePret = filtrarePret;
    }

    public void setFiltraremarime(Marime filtraremarime) {
        this.filtraremarime = filtraremarime;
    }

    @Override
    public void cautare(String brand, Float pret, Integer marime) {

    }
}
