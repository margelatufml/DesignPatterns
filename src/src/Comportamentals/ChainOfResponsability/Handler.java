package Comportamentals.ChainOfResponsability;//Chain: pasi, interschimbate

public abstract class Handler {
    protected Handler next;

    public void setnext(Handler next){
        this.next = next;
    }

    public abstract void  handleRequest(String request);
}
