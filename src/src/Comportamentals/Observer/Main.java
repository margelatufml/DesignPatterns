package Comportamentals.Observer;

public class Main {
    public static void main(String[] args) {
        Client client1=new Client("Florin");
        Client client2=new Client("Florinel");
        Client client3=new Client("Floricica");

        Restaurant restaurant= new Restaurant("Pizzeria ASE");
        restaurant.addObserver(client1);
        restaurant.addObserver(client2);
        restaurant.addObserver(client3);

        restaurant.addMeniu("Produs");
        restaurant.removeObserver(client1);
        restaurant.reducereMeniu("Pizzeria Vegetariana",20);
    }
}