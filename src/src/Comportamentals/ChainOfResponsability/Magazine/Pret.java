package Comportamentals.ChainOfResponsability.Magazine;

import java.util.ArrayList;
import java.util.List;

public class Pret extends Handler{
    @Override
    public void cautare(String brand, Float pret, Integer marime) {
        List<Produs> produseramaseFiltrare=new ArrayList<>();
        for(Produs produs:this.getProduseRamase()){
            if(produs.getPret()<pret){
                produseramaseFiltrare.add(produs);
            }
        }
        this.setProduseRamase(produseramaseFiltrare);
    }
}
