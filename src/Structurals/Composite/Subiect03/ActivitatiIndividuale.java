package Subiect03;

public class ActivitatiIndividuale implements IActivity {
    private Double durataOre;
    private String nume;

    public ActivitatiIndividuale(Double durataOre, String nume) {
        this.durataOre = durataOre;
        this.nume = nume;
    }

    @Override
    public Double getTotalDurationTime() {
        return durataOre;
    }

    @Override
    public String getDescription() {
        return nume;
    }
}
