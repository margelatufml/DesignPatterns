package Subiect02;

import java.util.ArrayList;
import java.util.List;

public class AdaugareCertificate extends Decorator{
    public AdaugareCertificate(IFunctionalitati cursDecorated) {
        super(cursDecorated);
    }

    @Override
    public List<String> adaugareFunctionalitate() {
        List<String> adaugate=new ArrayList<>(super.adaugareFunctionalitate());
        adaugate.add("Certificate");
        return adaugate;
    }

    @Override
    public void ceSaAdaugat() {
        System.out.println(" Certificate, ");
        super.ceSaAdaugat();
    }
}
