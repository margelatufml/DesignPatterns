package Comportamentals.Strategy.RezolvareCTSRepo;

public class OfertaMeniu {
    private String denumireMeniu;
    private Integer nrCalorii;
    private Integer nrCarbohidrati;

    public OfertaMeniu(String denumireMeniu, Integer nrCalorii, Integer nrCarbohidrati) {
        this.denumireMeniu = denumireMeniu;
        this.nrCalorii = nrCalorii;
        this.nrCarbohidrati = nrCarbohidrati;
    }

    public String getDenumireMeniu() {
        return denumireMeniu;
    }

    public Integer getNrCarbohidrati() {
        return nrCarbohidrati;
    }

    public Integer getNrCalorii() {
        return nrCalorii;
    }

    @Override
    public String toString() {
        return "OfertaMeniu{" +
                "denumireMeniu='" + denumireMeniu + '\'' +
                ", nrCalorii=" + nrCalorii +
                ", nrCarbohidrati=" + nrCarbohidrati +
                '}';
    }
}
