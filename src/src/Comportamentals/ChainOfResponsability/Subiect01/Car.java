package Comportamentals.ChainOfResponsability.Subiect01;

public class Car {
    private String name;
    private Integer anFabricatie;
    private Float pret;

    public Car(String name, Float pret, Integer anFabricatie) {
        this.name = name;
        this.pret = pret;
        this.anFabricatie = anFabricatie;
    }

    public String getName() {
        return name;
    }

    public Float getPret() {
        return pret;
    }

    public Integer getAnFabricatie() {
        return anFabricatie;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", anFabricatie=" + anFabricatie +
                ", pret=" + pret +
                '}';
    }
}
