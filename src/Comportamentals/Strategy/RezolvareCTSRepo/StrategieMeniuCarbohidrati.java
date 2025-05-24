package RezolvareCTSRepo;

import java.util.ArrayList;

public class StrategieMeniuCarbohidrati implements IProcesabil {
    @Override
    public OfertaMeniu alegereMeniu(ArrayList<OfertaMeniu> listaMeniuri) {
        OfertaMeniu ofertaMeniuMinime=listaMeniuri.get(0);
        for(OfertaMeniu meniu:listaMeniuri){
            if(meniu.getNrCarbohidrati()<ofertaMeniuMinime.getNrCarbohidrati()){
                ofertaMeniuMinime=meniu;
            }
        }
        return ofertaMeniuMinime;
    }
}
