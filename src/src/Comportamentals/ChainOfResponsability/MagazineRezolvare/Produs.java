package Comportamentals.ChainOfResponsability.MagazineRezolvare;

public class Produs implements IProdus{
    private String nume;
    private Float pret;
    private Float marime;
    private Integer cantitate;

    public Produs(String nume, Float pret,Float marime,Integer cantitate) {
        this.nume = nume;
        this.marime = marime;
        this.pret = pret;
        this.cantitate=cantitate;
    }

    public String getNume() {
        return nume;
    }

    public Float getPret() {
        return pret;
    }

    public Float getMarime() {
        return marime;
    }

    @Override
    public Integer getNrBucati() {
        return this.cantitate;
    }

    @Override
    public void afisareDenumire() {
System.out.println("Acesta este un produs "+this.nume);
    }
}
