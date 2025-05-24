package rezolvare_Strategy;

import java.util.List;
import java.util.stream.Collectors;

public class CautareImplicita implements ICautare{
    @Override
    public List<Produs> cauta(List<Produs> produse) {
        return produse.stream().filter(p->p.getPret()<=300 && p.getMarime()==42).collect(Collectors.toList());
    }
}
