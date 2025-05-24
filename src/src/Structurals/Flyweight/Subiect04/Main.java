package Structurals.Flyweight.Subiect04;

import java.time.LocalDate;
import java.util.Date;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        TipTransport[] tipuri = TipTransport.values();
        Random random = new Random();
CantitateMaxima cantitateMaxima=new CantitateMaxima(10,20,5);
        for (int i = 0; i < 25; i++) {
            TipTransport tipales=tipuri[random.nextInt(tipuri.length)];
            Bilet bilet=null;
            switch (tipales){
                case AUTOBUZ:
                    bilet=new Bilet(LocalDate.of(2023, 10, 17),100.00);
                    break;
                case TREN:
                    bilet=new Bilet(LocalDate.of(2023, 10, 17),150.00);
                    break;
                case METROU:
                    bilet=new Bilet(LocalDate.of(2023, 10, 17),20.00);
                    break;
            }
            EmitereFactory.getEmitereBilet(tipales).procesareBilet(tipales,cantitateMaxima,bilet);
        }
    }
}
