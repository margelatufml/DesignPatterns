package Structurals.Composite.Subiect03;

public class Bilet {
    private String numeInvitat;
    private Double pret;
    private TipBilet tip;

    public Bilet(Double pret, TipBilet tip, String numeInvitat) {
        this.pret = pret;
        this.tip = tip;
        this.numeInvitat = numeInvitat;
    }

    public String getNumeInvitat() {
        return numeInvitat;
    }

    public Double getPret() {
        return pret;
    }

    public Double MakePayment(IPaymentMethod tipPlata){
        return tipPlata.totalCost(tip);
    }
}
