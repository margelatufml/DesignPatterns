package Structurals.Flyweight.Subiect04;

public class RezervareBiletTren implements IRezervationProcess{
    @Override
    public void book() {
        System.out.println("Sistemul a creeat un bilet de Tren");
    }
}
