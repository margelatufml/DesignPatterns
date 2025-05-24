package Structurals.Facade;

public class DVDPlayer {
    public void on(){
        System.out.println("DVD Player pornmit");
    }
    public void play(String movie){
        System.out.println("Readre " + movie);
    }
    public void stop(){
        System.out.println("DVD Player oprit");
    }
    public void off(){
        System.out.println("DVD Player inchis");
    }

}
