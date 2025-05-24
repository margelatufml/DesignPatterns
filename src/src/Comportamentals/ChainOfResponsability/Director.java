package Comportamentals.ChainOfResponsability;

public class Director extends Handler{
    @Override
    public void handleRequest(String request) {
        if (request.equals("medium")) {
            System.out.println("Director handled medium-level request.");
        } else if (next != null) {
            next.handleRequest(request);
        }
    }
}
