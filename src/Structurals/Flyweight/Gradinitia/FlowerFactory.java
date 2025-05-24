package Gradinitia;

import java.util.HashMap;
import java.util.Map;

public class FlowerFactory {
    private static Map<TipFlori,IFlowerShow> floriList=new HashMap<>();

    public static IFlowerShow returnareFlori(TipFlori flower){
        IFlowerShow gradina=floriList.get(flower);
        if(gradina == null){
            gradina=new Garden(flower);
            floriList.put(flower,gradina);
        }
        return gradina;
    }
}
