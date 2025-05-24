package Structurals.Proxy;//proxy: Ofera un substituit pentru un obiect, controland accesul la acesta

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        IImage image= new Proxyimage("test.jpg");
        image.display();
    }
}