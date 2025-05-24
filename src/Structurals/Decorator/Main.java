//Decorator permite adaugarea dinamica de responsabilitati  unui obiect
public class Main {
    public static void main(String[] args) {
        ICoffee cofee=new SimpleCoffee();
        cofee=new Milkdecorator(cofee);
        cofee=new SugarDecorator(cofee);
        System.out.println("Cost: "+ cofee.getCost());
        System.out.println("Descriere: "+ cofee.getDescription());
    }
}