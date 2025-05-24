package Comportamentals.ChainOfResponsability.Subiect01;

import java.util.List;

public abstract class Handler implements ICarSearch{
    protected Handler next;

    public void setnext(Handler next){
        this.next=next;
    }

}
