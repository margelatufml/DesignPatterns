package Structurals.Facade.Subiect05;

public class ControlSistemeInteligenteProxy implements IDeviceControl{
    private ControlSistemeInteligente comandaSisteme;
    private String password;

    public ControlSistemeInteligenteProxy(String password) {
        this.password = password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public void setareDispozitive(Integer luminozitate, Integer nivelSecuritate, Double temperatura) {
        if(this.password.equals("atest")){
            this.comandaSisteme=new ControlSistemeInteligente();
            comandaSisteme.setareDispozitive(luminozitate,nivelSecuritate,temperatura);
            System.out.println("Sisteme au fost setate dupa logarea cu parola");
        }else{
            System.out.println("Parola este incorecta, mai incearca inca o data");
        }
    }
}
