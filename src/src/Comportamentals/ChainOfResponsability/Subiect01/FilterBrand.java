package Comportamentals.ChainOfResponsability.Subiect01;

import java.util.ArrayList;
import java.util.List;

public class FilterBrand extends Handler implements ICarSearch{
    private final String brand;

    public FilterBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public void searchCar(List<Car> carlist) {
        List<Car> carbuffer=new ArrayList<>();
        if (brand != null) {
            for (Car car : carlist) {
                if (car.getName().equals(brand)) {
                    carbuffer.add(car);
                }
            }
        }
            if (next == null) {
                if(brand!=null) {
                    for (Car car : carbuffer) {
                        System.out.println(car.toString() + " \n");
                    }
                }else{
                    for (Car car : carlist) {
                        System.out.println(car.toString() + " \n");
                    }
                }
            }else if(brand!=null){
                this.next.searchCar(carbuffer);
            }else{
                this.next.searchCar(carlist);

            }
    }
}
