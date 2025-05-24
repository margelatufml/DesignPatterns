package Structurals.Facade.Subiect05;

public class HomeDevicesFacade {
private Lumini lumini;
private Termostat termostat;
private SistemSecuritate sistemSecuritate;

    public HomeDevicesFacade() {
        this.lumini = new Lumini(0);;
        this.termostat = new Termostat(0.0);
        this.sistemSecuritate = new SistemSecuritate(0);
    }

    public void intrareNesecurizata(){
        this.lumini.setLumiozitate(100);
        sistemSecuritate.setNivelSecuritate(100);
        lumini.homeControl();
        sistemSecuritate.homeControl();
    }

    public void intrareDetinatorCasa(){
        this.lumini.setLumiozitate(40);
        termostat.setTemperatura(22.00);
        sistemSecuritate.setNivelSecuritate(10);
        lumini.homeControl();
        termostat.homeControl();
        sistemSecuritate.homeControl();
    }
    public void plecatDeAcasa(){
        termostat.setTemperatura(12.00);
        sistemSecuritate.setNivelSecuritate(40);
        termostat.homeControl();
        sistemSecuritate.homeControl();
    }
}
