package Comportamentals.Template;

public abstract class Meal {

    public final void prepareMeal() {
        boilWater();
        cook();
        serve();
    }


    private void boilWater() {
        System.out.println("Boiling water");
    }

    protected abstract void cook();

    private void serve() {
        System.out.println("Serving the meal");
    }
}
