package Structurals.Flyweight.Subiect04;

public class RezervareBiletMetrou implements IRezervationProcess{
    @Override
    public void book() {
        System.out.println("Sistemul a creeat un bielt de metrou");
    }
}
