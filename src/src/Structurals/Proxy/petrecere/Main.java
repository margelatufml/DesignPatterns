package Structurals.Proxy.petrecere;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<String> listaInvitati = new ArrayList<>();
        listaInvitati.add("Mos Craciun");
        listaInvitati.add("Renul Rudolf");

        Client cl1 = new Client("Gigel", 20);
        Client cl2 = new Client("Costel", 12);
        Petrecere petrecere = new Petrecere("24.12.2022", listaInvitati);
        petrecere.adaugaParticiant(cl2);

        System.out.println("Afisare dupa proxy");
        Client cl3 = new Client("Marcel", 20);
        Client cl4 = new Client("Ionela", 12);
        IPetrecere petrecereProxy = new PetrecereProxy(petrecere);
        petrecere.adaugaParticiant(cl3);
        //petrecereProxy.adaugaParticipant(cl3);
        petrecereProxy.adaugaParticiant(cl4);
    }
}
