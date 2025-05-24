package Comportamentals.ChainOfResponsability;


public class Main {
    public static void main(String[] args) {
        Handler manager = new Manager();
        Handler director = new Director();
        Handler ceo = new CEO();

        manager.setnext(director);
        director.setnext(ceo);

        manager.handleRequest("medium"); // Director handled medium-level request.
        manager.handleRequest("high");   // CEO handled high-level request.
        manager.handleRequest("low");    // Manager handled low-level request.
    }
}