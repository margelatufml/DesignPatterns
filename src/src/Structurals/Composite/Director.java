package Structurals.Composite;//Clasa compozita: director, unde sunt mai multe fisiere ce fac parte din aceasta clasa

import java.util.ArrayList;
import java.util.List;

public class Director implements IFileSystemComponent{
    private String name;
    private List<IFileSystemComponent> components=new ArrayList<>();

    public Director(String name) {
        this.name = name;
    }
    public void addComponent(IFileSystemComponent component){
        components.add(component);
    }

    @Override
    public long getSize() {
        long total=0;
        for(IFileSystemComponent component:components){
            total+=component.getSize();
        }
        return total;
    }
}
