package EditorGrafic;

public class Pictograma {
    private Integer latime;
    private Integer lungime;
    private Integer x;
    private Integer y;

    public Pictograma(Integer latime, Integer x, Integer lungime, Integer y) {
        this.latime = latime;
        this.x = x;
        this.lungime = lungime;
        this.y = y;
    }

    public void afisareLocatieSiDimensiuni(){
        System.out.println("Aceasta este pozitia imaginii " + x + " " + y + "latime : "+ latime+ " lungime: "+ lungime);
    }
}
