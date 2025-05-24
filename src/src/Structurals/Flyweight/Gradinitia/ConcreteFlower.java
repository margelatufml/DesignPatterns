package Structurals.Flyweight.Gradinitia;

public class ConcreteFlower implements IFlower{
    private Integer x;
    private Integer y;

    public ConcreteFlower(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

    public Integer getX() {
        return x;
    }

    public Integer getY() {
        return y;
    }

    @Override
    public void display() {
        System.out.println("Si acestea sunt pozitiile florii" + x+ " " + y+ "\n");
    }
}
