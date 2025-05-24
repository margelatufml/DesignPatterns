package Structurals.Flyweight.EditorGrafic;

public class ConcreteFlyweight implements IdisplayPictograma{
    private TipPictograma type;
    private Integer number=0;

    public ConcreteFlyweight(TipPictograma type) {
        this.type = type;
        incrementNumberPictograma();
    }

    private void incrementNumberPictograma(){
        number++;
        System.out.println("S-a mai adaugat o noua pictograma pentru " + type.toString());
    }

    @Override
    public void display(Pictograma pictograma) {
        pictograma.afisareLocatieSiDimensiuni();
        System.out.println("\n");
        System.out.println("Aceasta pictogramai ii apartine imaginii ce are tipul " + this.type);
        if (number != 1) {
            incrementNumberPictograma();
        }
    }
}
