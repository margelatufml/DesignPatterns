package RezolvareCTSRepo;

import java.util.ArrayList;

public class StrategieCaloriiMinime implements IProcesabil {
    @Override
    public OfertaMeniu alegereMeniu(ArrayList<OfertaMeniu> listaMeniuri) {
        OfertaMeniu ofertaMeniuMinime=listaMeniuri.get(0);
        for(OfertaMeniu meniu:listaMeniuri){
            if(meniu.getNrCalorii()<ofertaMeniuMinime.getNrCalorii()){
                ofertaMeniuMinime=meniu;
            }
        }
        return ofertaMeniuMinime;
    }
}
