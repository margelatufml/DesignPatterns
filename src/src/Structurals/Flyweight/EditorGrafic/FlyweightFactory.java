package Structurals.Flyweight.EditorGrafic;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private static Map<TipPictograma,ConcreteFlyweight> mapaPictograme=new HashMap<>();


    public static ConcreteFlyweight interactiuneFlyweight(TipPictograma type){
        ConcreteFlyweight flyweightComponent=mapaPictograme.get(type);
        if(flyweightComponent==null){
            flyweightComponent=new ConcreteFlyweight(type);
            mapaPictograme.put(type,flyweightComponent);
        }
        return flyweightComponent;
    }

}
