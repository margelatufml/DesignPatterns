package Subiect01;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Handler filterAn = new FilterAnFabricatie(2003);
        Handler filterBrand = new FilterBrand(null);
        Handler filterPrice = new FilterPrice(3500f);

        List<Car> carlist= List.of(new Car("Audi",1000f,2015),new Car("BMW",1000f,2000),new Car("Audi",12000f,2015),new Car("Mazda",1000f,2015),new Car("Tesla",1000f,2015),new Car("Ford",1000f,2015),new Car("Audi",3000f,2009),new Car("Mercedes",1000f,2015),new Car("Audi",2000f,2000),new Car("Audi",100000f,2015));

        filterAn.setnext(filterPrice);
        filterPrice.setnext(filterBrand);

        filterAn.searchCar(carlist);


        IRental rental=new RentalProgramme();
        rental=new FuleDecorator(rental);
        rental=new SecurityDecorator(rental);
        System.out.println("cost + " + rental.getCost());
        rental.getdescription();
    }
}
