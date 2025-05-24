package Subiect05;

public class SistemSecuritate implements IHomeControl{
    private Integer nivelSecuritate;

    public SistemSecuritate(Integer nivelSecuritate) {
        this.nivelSecuritate = nivelSecuritate;
    }

    public void setNivelSecuritate(Integer nivelSecuritate) {
        this.nivelSecuritate = nivelSecuritate;
    }

    @Override
    public void homeControl() {
        System.out.println("Sistemul de securitate a inceput sa mearga cu un nivel de securitate de "+ nivelSecuritate);
    }
}
