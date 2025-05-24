package Structurals.Proxy;

public class RealImage implements IImage {
   private String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadfromDisk();
    }

    private void loadfromDisk(){
        System.out.println("Incarcare ..."+ filename);
    }

    @Override
    public void display() {
        System.out.println("Afisare "+ filename);
    }
}
