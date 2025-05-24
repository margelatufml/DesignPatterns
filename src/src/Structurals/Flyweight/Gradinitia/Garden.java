package Structurals.Flyweight.Gradinitia;

public class Garden implements IFlowerShow{
    private TipFlori type;

    public Garden(TipFlori type) {
        this.type = type;
    }

    @Override
    public void disolayFlower(ConcreteFlower flower) {
     System.out.println("Aceasta este pozitia florii " + type);
     flower.display();
    }
}
