package Structurals.Composite.Subiect03;

public class TransferBancar implements IPaymentMethod{
    private Double payment;

    @Override
    public Double totalCost(TipBilet bilettip) {
        switch (bilettip){
            case VIP:
                this.payment=100.00;
                break;
            case STANDARD:
                this.payment=50.00;
                break;
            case PREMIUM:
                this.payment=75.00;
                break;
        }
        return this.payment+2;
    }
}
