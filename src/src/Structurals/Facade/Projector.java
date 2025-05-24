package Structurals.Facade;

public class Projector {
    public void on(){
        System.out.println("Proiector pornit");
    }
    public void setInput(String input){
        System.out.println("Proiector setat pe "+ input);
    }

    public void off(){
        System.out.println("Proiector inchis");
    }
}
