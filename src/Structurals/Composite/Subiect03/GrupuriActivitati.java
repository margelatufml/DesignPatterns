package Subiect03;

import java.util.ArrayList;
import java.util.List;

public class GrupuriActivitati implements IActivity{
    private String nume;
    private List<ActivitatiIndividuale> listaActivitati;

    public GrupuriActivitati(String nume, List<ActivitatiIndividuale> listaActivitati) {
        this.nume = nume;
        this.listaActivitati = listaActivitati;
    }

    public String getNume() {
        return nume;
    }

    public List<ActivitatiIndividuale> getListaActivitati() {
        return listaActivitati;
    }

    @Override
    public Double getTotalDurationTime() {
        Double totalOre=0.0;
        for(ActivitatiIndividuale act:listaActivitati){
            totalOre+=act.getTotalDurationTime();
        }
        return totalOre;
    }

    @Override
    public String getDescription() {
StringBuilder listanume = new StringBuilder();
for(ActivitatiIndividuale act:listaActivitati){
    listanume.append(act.getDescription());
}
return listanume.toString();
    }
}
