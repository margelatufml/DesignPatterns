package Comportamentals.ChainOfResponsability;

public class Manager extends Handler{
    @Override
    public void handleRequest(String request) {
        if(request.equals("low")){
            System.out.println("Manager handle low-level request.");
        }else if (next!=null){
            next.handleRequest(request);
        }
    }
}
