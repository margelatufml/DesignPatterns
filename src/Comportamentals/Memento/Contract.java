public class Contract {
    private String clauzeContractuale;
    private String numeClient;

    public Contract(String numeClient) {
        this.numeClient = numeClient;
        this.clauzeContractuale = "";
    }

    public void adaugareClauzeContractuale(String clauza){
        this.clauzeContractuale+=' ' + clauza;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "clauzeContractuale='" + clauzeContractuale + '\'' +
                ", numeClient='" + numeClient + '\'' +
                '}';
    }

    public void restoreFromMemento(VersiuneContract versiuneContract){
        this.clauzeContractuale=versiuneContract.getClauzeContractuale();
    }

    public VersiuneContract saveToMemento(){
        System.out.println("salvare versiune contract");
        return new VersiuneContract(clauzeContractuale);
    }
}
