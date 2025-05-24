package Structurals.Composite.Subiect03;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<ActivitatiIndividuale> listaActivitati= List.of(new ActivitatiIndividuale(1.0,"prezentare One Capital,"),new ActivitatiIndividuale(0.5," pauza,"),new ActivitatiIndividuale(2.5," prezentare ConstructSRL,"));
        GrupuriActivitati prezentareConstructii=new GrupuriActivitati("prezentare Constructii",listaActivitati);
        List<ActivitatiIndividuale> listaActivitatiMireasa= List.of(new ActivitatiIndividuale(2.0," prezentare Mireasa pentru fiul meu, "),new ActivitatiIndividuale(0.5," pauza,"),new ActivitatiIndividuale(3.5," prezentare Rochii pentur mine SRL,"));
        GrupuriActivitati prezentareMatrimoniale=new GrupuriActivitati("prezentare Nunta",listaActivitatiMireasa);
        IActivity EvenimentComplexConstructiNunta=new Eveniment("prezentare constructii nunta",List.of(prezentareConstructii,prezentareMatrimoniale));
        System.out.println("Aceasta este planul evenimentului " +  EvenimentComplexConstructiNunta.getDescription());
        System.out.println("Aceasta este durata totala de ore " + EvenimentComplexConstructiNunta.getTotalDurationTime().toString());
        IPaymentMethod card=new Card();
        IPaymentMethod portofelDigital=new PortofelDigital();
        IPaymentMethod transferBancar=new TransferBancar();
        Bilet bilet1=new Bilet(card.totalCost(TipBilet.VIP),TipBilet.VIP,"Andrei");
        Bilet bilet2=new Bilet(portofelDigital.totalCost(TipBilet.PREMIUM),TipBilet.PREMIUM,"Ana");
        Bilet bilet3=new Bilet(transferBancar.totalCost(TipBilet.STANDARD),TipBilet.STANDARD,"Mircea");
        System.out.println("Acesta este pt bilet1 " + bilet1.getPret()  + " pentru "+ bilet1.getNumeInvitat());
        System.out.println("Acesta este pt bilet2 " + bilet2.getPret()  + " pentru "+ bilet2.getNumeInvitat());
        System.out.println("Acesta este pt bilet3 " + bilet3.getPret()  + " pentru "+ bilet3.getNumeInvitat());
    }
}
