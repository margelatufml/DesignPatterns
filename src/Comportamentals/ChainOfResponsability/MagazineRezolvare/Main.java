package MagazineRezolvare;


import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Produs> inventar = List.of(
                new Produs("Nike", 350f, 42f,4),
                new Produs("Adidas", 280f, 40f,1),
                new Produs("Puma", 300f, 42f,2),
                new Produs("Nike", 400f, 41f,5),
                new Produs("Adidas", 220f, 42f,7)
        );
        IProdus subcategorie1=new Subcategorii("pantofi-casual",List.of(new Produs("Nike", 350f, 42f,4),
                new Produs("Adidas", 280f, 40f,1),
                new Produs("Puma", 300f, 42f,2),
                new Produs("Nike", 400f, 41f,5)));
        IProdus subcategorie2=new Subcategorii("pantofi-sport",List.of(new Produs("Rebook", 350f, 42f,4),
                new Produs("Strong", 280f, 40f,1)));

        IProdus categorie=new Categorii("pantofi",List.of(subcategorie1,subcategorie2));

        categorie.afisareDenumire();
        System.out.println(categorie.getNrBucati() + " acestea sunt bucatile din acea categorie \n");

        Magazin magazin = new Magazin();

        // 1) Client alege doar brand și size
        List<Produs> rez1 = magazin.cautare(inventar, "Adidas", null, 42f);
        System.out.println("1) Brand=Adidas, Size=42 → " + rez1);

        // 2) Client alege doar price
        List<Produs> rez2 = magazin.cautare(inventar, null, 300f, null);
        System.out.println("2) Price<=300 → " + rez2);

        // 3) Client alege toate criteriile
        List<Produs> rez3 = magazin.cautare(inventar, "Nike", 380f, 42f);
        System.out.println("3) Brand=Nike, Price<=380, Size=42 → " + rez3);

        // 4) Client nu alege niciun filtru
        List<Produs> rez4 = magazin.cautare(inventar, null, null, null);
        System.out.println("4) Fără filtre → " + rez4);
    }
}