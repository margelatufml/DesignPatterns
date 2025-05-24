package Comportamentals.Memento;

import java.util.ArrayList;

public class VersiuneContract {

    private String clauzeContractuale;

    public VersiuneContract(String clauzeContractuale){
        super();
        this.clauzeContractuale=clauzeContractuale;
    }

    public String getClauzeContractuale(){return clauzeContractuale;}
}
