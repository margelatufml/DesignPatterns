package Subiect01;

import java.util.ArrayList;
import java.util.List;

public class FilterAnFabricatie extends  Handler implements ICarSearch{
    private Integer anFabricatie;

    public FilterAnFabricatie(Integer anFabricatie) {
        this.anFabricatie = anFabricatie;
    }

    @Override
    public void searchCar(List<Car> carList) {
        List<Car> carbuffer=new ArrayList<>();
        if (anFabricatie != null) {
            for (Car car : carList) {
                if (car.getAnFabricatie()>anFabricatie) {
                    carbuffer.add(car);
                }
            }
        }
        if (next == null) {
            if(anFabricatie!=null) {
                for (Car car : carbuffer) {
                    System.out.println(car.toString() + " \n");
                }
            }else{
                for (Car car : carList) {
                    System.out.println(car.toString() + " \n");
                }
            }
        }else if(anFabricatie!=null){
            this.next.searchCar(carbuffer);
        }else{
            this.next.searchCar(carList);

        }
    }
}
