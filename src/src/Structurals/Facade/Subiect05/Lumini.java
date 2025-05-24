package Structurals.Facade.Subiect05;

public class Lumini implements IHomeControl{
    private Integer lumiozitate;

    public Lumini(Integer lumiozitate) {
        this.lumiozitate = lumiozitate;
    }

    public void setLumiozitate(Integer lumiozitate) {
        this.lumiozitate = lumiozitate;
    }

    @Override
    public void homeControl() {
        System.out.println("Luminile s-au aprins cu o luminozitate de " + lumiozitate);
    }
}
