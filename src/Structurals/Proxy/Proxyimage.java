
public class Proxyimage implements IImage {
    private RealImage realImage;
    private String filename;

    public Proxyimage(String filename){
        this.filename=filename;
    }

    @Override
    public void display() {
        if(realImage==null){
            realImage=new RealImage(filename);
        }
        realImage.display();
    }
}
