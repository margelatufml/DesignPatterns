package Comportamentals.ChainOfResponsability.Magazine;

import java.util.List;

public abstract class Handler implements ICautare{
    protected Handler next;
    private List<Produs> produseRamase;

    public void setNext(Handler next) {
        this.next = next;
    }

    @Override
    public void cautare(String brand, Float pret, Integer marime) {
    }

    public List<Produs> getProduseRamase() {
        return produseRamase;
    }

    public void setProduseRamase(List<Produs> produseRamase) {
        this.produseRamase = produseRamase;
    }
}
