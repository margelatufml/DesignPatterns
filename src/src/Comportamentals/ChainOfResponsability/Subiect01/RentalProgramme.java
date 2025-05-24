package Comportamentals.ChainOfResponsability.Subiect01;

public class RentalProgramme implements IRental{
    @Override
    public Integer getCost() {
        return 100;
    }

    @Override
    public void getdescription() {
System.out.println("These are the rental costs = " + getCost().toString() + " the rental basic fee,");
    }
}
