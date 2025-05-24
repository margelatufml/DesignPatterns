package Comportamentals.Strategy.rezolvare_Strategy;

public class Produs {
    private String brand;
    private Float pret;
    private Integer marime;

    public Produs(String brand, Integer marime, Float pret) {
        this.brand = brand;
        this.marime = marime;
        this.pret = pret;
    }

    @Override
    public String toString() {
        return "Produs{" +
                "brand='" + brand + '\'' +
                ", pret=" + pret +
                ", marime=" + marime +
                '}';
    }

    public Float getPret() {
        return pret;
    }

    public Integer getMarime() {
        return marime;
    }

    public String getBrand() {
        return brand;
    }
}
