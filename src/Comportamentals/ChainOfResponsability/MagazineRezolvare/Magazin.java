package MagazineRezolvare;

import MagazineRezolvare.Produs;
import MagazineRezolvare.ICautare;

import java.util.List;

public class Magazin  implements ICautare {


    @Override
    public List<Produs> cautare(List<Produs> produse, String brand, Float pretMaxim, Float marime) {

        //Brand -> Price -> Size
        FilterHandler chain=new BrandFilter(brand).setnext(new PriceFilter(pretMaxim)).setnext(new SizeFilter(marime));

        return chain.handle(produse);
    }
}
