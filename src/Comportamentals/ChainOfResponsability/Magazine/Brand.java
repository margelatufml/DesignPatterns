package Magazine;

import java.util.ArrayList;
import java.util.List;

public class Brand extends Handler{
    @Override
    public void cautare(String brand, Float pret, Integer marime) {
        List<Produs> produseramaseFiltrare=new ArrayList<>();
        for(Produs produs:this.getProduseRamase()){
            if(produs.getNume()==brand){
                produseramaseFiltrare.add(produs);
            }
        }
        this.setProduseRamase(produseramaseFiltrare);
    }
}
