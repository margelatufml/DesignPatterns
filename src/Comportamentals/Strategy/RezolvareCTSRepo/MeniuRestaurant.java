package RezolvareCTSRepo;

import java.util.ArrayList;

public class MeniuRestaurant {
    private ArrayList<OfertaMeniu> listaMeniuri=new ArrayList<>();
    private IProcesabil strategieAlegere;

    public void addOfertaMeniu(OfertaMeniu ofertameniu){
        this.listaMeniuri.add(ofertameniu);
    }

    public void setStrategieAlegere(IProcesabil strategie){
        this.strategieAlegere=strategie;
    }

    public OfertaMeniu alegereOferta(){
        if(strategieAlegere!=null){
            return strategieAlegere.alegereMeniu(listaMeniuri);
        }else{
            throw  new UnsupportedOperationException();
        }
    }
}
