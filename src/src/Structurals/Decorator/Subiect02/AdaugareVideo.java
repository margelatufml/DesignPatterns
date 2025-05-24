package Structurals.Decorator.Subiect02;

import java.util.ArrayList;
import java.util.List;

public class AdaugareVideo extends Decorator{

    public AdaugareVideo (IFunctionalitati cursDecorated) {
        super(cursDecorated);
    }

    @Override
    public void ceSaAdaugat() {
        System.out.println(" Video,  ");
        super.ceSaAdaugat();
    }

    @Override
    public List<String> adaugareFunctionalitate() {
        List<String> adaugate=new ArrayList<>(super.adaugareFunctionalitate());
        adaugate.add("Video");
        return adaugate;
    }
}
