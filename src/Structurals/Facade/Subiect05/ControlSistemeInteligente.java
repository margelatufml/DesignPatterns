package Subiect05;

public class ControlSistemeInteligente implements IDeviceControl{
    private Lumini lumini;
    private Termostat termostatl;
    private SistemSecuritate sistemSecuritate;

    @Override
    public void setareDispozitive(Integer luminozitate,Integer nivelSecuritate, Double temperatura){
        this.lumini=new Lumini(luminozitate);
        this.termostatl=new Termostat(temperatura);
        this.sistemSecuritate=new SistemSecuritate(nivelSecuritate);
    }


}
