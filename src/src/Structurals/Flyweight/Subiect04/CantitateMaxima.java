package Structurals.Flyweight.Subiect04;

public class CantitateMaxima {
    private Integer tipAutobuz;
    private Integer tipTren;
    private  Integer tipmetrou;
    private RezervareBiletAutobuz rezervareBiletAutobuz;
    private RezervareBiletMetrou rezervareMetrou;
    private RezervareBiletTren rezervareTren;

    public CantitateMaxima(Integer tipAutobuz, Integer tipmetrou, Integer tipTren) {
        this.tipAutobuz = tipAutobuz;
        this.tipmetrou = tipmetrou;
        this.tipTren = tipTren;
        this.rezervareMetrou=new RezervareBiletMetrou();
        this.rezervareTren=new RezervareBiletTren();
        this.rezervareBiletAutobuz=new RezervareBiletAutobuz();
    }

    public Integer getNumarDisponibil(TipTransport tip){
        Integer numarBilete;
        switch (tip){
            case AUTOBUZ:
                numarBilete=tipAutobuz;
                break;
            case TREN:
                numarBilete=tipTren;
                break;
            case METROU:
                numarBilete=tipmetrou;
                break;
            default:
                numarBilete=-1;
        }
        return numarBilete;
    }

    public void setNumarBilete(TipTransport tipTransport){
        switch (tipTransport){
            case AUTOBUZ:
                tipAutobuz--;
                rezervareBiletAutobuz.book();
                break;
            case TREN:
                tipTren--;
                rezervareTren.book();
                break;
            case METROU:
                tipmetrou--;
                rezervareMetrou.book();
                break;
            default:
                throw new RuntimeException();
        }
    }

}
