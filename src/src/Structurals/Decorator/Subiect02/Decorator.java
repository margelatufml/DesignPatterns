package Structurals.Decorator.Subiect02;

import java.util.ArrayList;
import java.util.List;

public abstract class Decorator implements IFunctionalitati{
    protected IFunctionalitati cursDecorated;

    public Decorator(IFunctionalitati cursDecorated) {
        this.cursDecorated = cursDecorated;
    }

    @Override
    public List<String> adaugareFunctionalitate() {
        return new ArrayList<>(cursDecorated.adaugareFunctionalitate());
    }

    @Override
    public void ceSaAdaugat() {
        cursDecorated.ceSaAdaugat();
    System.out.println("Acestea sunt lucrurile adaugate= ");
    }
}
