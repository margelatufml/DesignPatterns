package petrecere;

import java.util.ArrayList;
import java.util.List;

public class Petrecere implements IPetrecere{
    private String data;
    private List<String> listaInvitati;
    private List<Client> listaParticipanti;

    public Petrecere(String data, List<String> listaInvitati) {
        super();
        this.data = data;
        this.listaInvitati = listaInvitati;
        this.listaParticipanti=new ArrayList<>();
    }

    @Override
    public void adaugaParticiant(Client c1) {
this.listaParticipanti.add(c1);
System.out.println("Clientyul "+ c1 + " a fost adaugat la petrecere" );
    }

    @Override
    public void afisareProgram() {
//TO-DO Auto-generated method stub
        System.out.println("Clientyu a fost adaugat la program" );

    }
}
