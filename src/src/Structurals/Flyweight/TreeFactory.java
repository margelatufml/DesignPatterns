package Structurals.Flyweight;

import java.util.HashMap;
import java.util.Map;

public class TreeFactory {
    private static Map<String,TreeType> treeTypes=new HashMap<>();

    public static TreeType getTreeType(String name,String texture){
        TreeType type=treeTypes.get(name);
        if(type==null){
            type=new TreeType(name,texture);
            treeTypes.put(name,type);
        }
        return  type;
    }
}
