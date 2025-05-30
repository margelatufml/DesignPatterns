package Structurals.Flyweight.Gradinitia.Program;

import Structurals.Flyweight.Gradinitia.ConcreteFlower;
import Structurals.Flyweight.Gradinitia.FlowerFactory;
import Structurals.Flyweight.Gradinitia.TipFlori;

import java.util.Random;
import java.util.concurrent.Flow;

public class Main {
    public static void main(String[] args) {
        TipFlori[] tipuri = TipFlori.values();
        Random random = new Random();
        for(Integer i=0;i<100;i++){
            for(Integer x=0;x<200;x++){
                TipFlori tip = tipuri[random.nextInt(tipuri.length)];
                ConcreteFlower flower=new ConcreteFlower(i,x);
                FlowerFactory.returnareFlori(tip).disolayFlower(flower);
            }
        }

    }
}
