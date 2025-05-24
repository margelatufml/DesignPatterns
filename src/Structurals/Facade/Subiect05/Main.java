package Subiect05;

public class Main {
    public static void main(String[] args) {
        //de aici incepe demonstrarea Facade
        HomeDevicesFacade facade=new HomeDevicesFacade();
        facade.intrareNesecurizata();
        facade.intrareDetinatorCasa();

        //de aici incepe demonstrarea Proxy

ControlSistemeInteligenteProxy proxy=new ControlSistemeInteligenteProxy("password");
proxy.setareDispozitive(10,3,10.0);
proxy.setPassword("atest");
proxy.setareDispozitive(10,40,10.12);
    }
}
