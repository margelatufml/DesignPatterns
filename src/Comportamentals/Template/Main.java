package Comportamentals.Template;

//Template permite definirea scheletului unui algorithm intr-o clasa de baza, delegand unele pasi catre subclase
//template: PENTRU METODA STANDARD, FACEM PARTEA DE FINAL PE METODA STANDARD
public class Main {
    public static void main(String[] args) {
        Meal meal1=new Pasta();
        meal1.prepareMeal();

        Meal meal2=new Rice();
        meal2.prepareMeal();
    }
}