package rezolvare_Strategy;

import java.util.List;

public class CautarePersonalizata implements ICautare {
    private  String brand;
    private  Float pret;
    private Integer marime;

    @Override
    public List<Produs> cauta(List<Produs> produse) {
        return List.of();
    }
}
