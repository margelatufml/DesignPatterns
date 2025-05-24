package Structurals.Flyweight.Subiect04;

import java.util.HashMap;

public class EmitereFactory {
    private static HashMap<TipTransport,EmitereBilet> listaEmitere=new HashMap<>();

    public static EmitereBilet getEmitereBilet(TipTransport tip){
        EmitereBilet bilet=listaEmitere.get(tip);
        if(bilet==null){
            bilet=new EmitereBilet(tip);
            listaEmitere.put(tip,bilet);
        }
        return bilet;
    }

}
