package Structurals.Facade.Subiect05;

public class Termostat implements IHomeControl{
    private Double temperatura;

    public Termostat(Double temperatura) {
        this.temperatura = temperatura;
    }

    public void setTemperatura(Double temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    public void homeControl() {
        System.out.println("Termostatul a inceput sa functioneze cu o temperatura de "+ temperatura + " grade celsius");
    }
}
