package Structurals.Flyweight.Subiect04;

public class EmitereBilet implements IRoute{
   private final TipTransport tipTransport;
   private Integer bileteDisponibile;

    public EmitereBilet(TipTransport tipTransport) {
        this.tipTransport = tipTransport;
    }

    @Override
    public void procesareBilet(TipTransport tip,CantitateMaxima maxim,Bilet bilet) {
       if(maxim.getNumarDisponibil(tip)>0){
           maxim.setNumarBilete(tip);
           System.out.println("Biletul cu pretul de " + bilet.getPrice()+ " a fost emis la data de "+ bilet.getDataEmiterii());
       }else{
            System.out.println("Nu mai sunt bilete disponibile pentru a fi emise");
       }
    }
}
