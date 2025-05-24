package Comportamentals.ChainOfResponsability.Magazine;

public class Produs {
    private String nume;
    private Float pret;
    private Integer marime;

    public Produs(String nume, Integer marime, Float pret) {
        this.nume = nume;
        this.marime = marime;
        this.pret = pret;
    }

    public String getNume() {
        return nume;
    }

    public Float getPret() {
        return pret;
    }

    public Integer getMarime() {
        return marime;
    }
}
