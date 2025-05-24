package Magazine;

import java.util.ArrayList;
import java.util.List;

public class Marime extends Handler{
    @Override
    public void cautare(String brand, Float pret, Integer marime) {
        List<Produs> produseramaseFiltrare=new ArrayList<>();
        for(Produs produs:this.getProduseRamase()){
            if(produs.getMarime()==marime){
                produseramaseFiltrare.add(produs);
            }
        }
        this.setProduseRamase(produseramaseFiltrare);
    }
}
