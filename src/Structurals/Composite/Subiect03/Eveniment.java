package Subiect03;

import java.util.ArrayList;
import java.util.List;

public class Eveniment implements IActivity{
    private String nume;
    private List<GrupuriActivitati> activitatiEveniment;


    public Eveniment(String nume, List<GrupuriActivitati> activitatiEveniment) {
        this.nume = nume;
        this.activitatiEveniment = activitatiEveniment;
    }

    public String getNume() {
        return nume;
    }

    public List<GrupuriActivitati> getActivitatiEveniment() {
        return activitatiEveniment;
    }

    @Override
    public Double getTotalDurationTime() {
        Double totalOre=0.0;
        for(GrupuriActivitati act:activitatiEveniment){
            totalOre+=act.getTotalDurationTime();
        }
        return totalOre;
    }

    @Override
    public String getDescription() {
        StringBuilder listanume = new StringBuilder();
        for(GrupuriActivitati act:activitatiEveniment){
            listanume.append(act.getDescription());
        }
        return listanume.toString();
    }
}
