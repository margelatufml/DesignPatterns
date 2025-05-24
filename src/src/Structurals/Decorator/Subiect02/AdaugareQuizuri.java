package Structurals.Decorator.Subiect02;

import java.util.ArrayList;
import java.util.List;

public class AdaugareQuizuri extends Decorator{
    public AdaugareQuizuri(IFunctionalitati cursDecorated) {
        super(cursDecorated);
    }

    @Override
    public List<String> adaugareFunctionalitate() {
        List<String> adaugate=new ArrayList<>(super.adaugareFunctionalitate());
        adaugate.add("Quizuri");
        return adaugate;
    }

    @Override
    public void ceSaAdaugat() {;
        System.out.println(" Quiz-uri, ");
        super.ceSaAdaugat();
    }
}
