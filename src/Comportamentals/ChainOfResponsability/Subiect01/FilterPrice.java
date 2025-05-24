package Subiect01;

import java.util.ArrayList;
import java.util.List;

public class FilterPrice extends Handler implements ICarSearch{
    private Float price;

    public FilterPrice(Float price) {
        this.price = price;
    }

    @Override
    public void searchCar(List<Car> carList) {
        List<Car> carbuffer=new ArrayList<>();
        if (price != null) {
            for (Car car : carList) {
                if (car.getPret()<price) {
                    carbuffer.add(car);
                }
            }
        }
        if (next == null) {
            if(price!=null) {
                for (Car car : carbuffer) {
                    System.out.println(car.toString() + " \n");
                }
            }else{
                for (Car car : carList) {
                    System.out.println(car.toString() + " \n");
                }
            }
        }else if(price!=null){
            this.next.searchCar(carbuffer);
        }else{
            this.next.searchCar(carList);

        }
    }
}
