package Structurals.Flyweight.EditorGrafic.Program;

import Structurals.Flyweight.EditorGrafic.FlyweightFactory;
import Structurals.Flyweight.EditorGrafic.Pictograma;
import Structurals.Flyweight.EditorGrafic.TipPictograma;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        TipPictograma[] tipuri = TipPictograma.values();
        Random random = new Random();
        for(int i=0;i<100;i++){
            for(int x=0;x<200;x++){
                TipPictograma tip = tipuri[random.nextInt(tipuri.length)];
                Pictograma pictograma=new Pictograma(i,x,x*14,i*14);
                FlyweightFactory.interactiuneFlyweight(tip).display(pictograma);
            }
        }

    }
}
