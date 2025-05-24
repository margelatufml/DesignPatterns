package Comportamentals.Memento;//Memento: Salveaza si restaureaza starea unui obiect fara a incalca principiile de incapsulare

public class Main {
    public static void main(String[] args) {
        ManagerContracte manager=new ManagerContracte();
        Contract contract=new Contract("Gigel");
        contract.adaugareClauzeContractuale("Clauza1");
        System.out.println(contract);
        contract.adaugareClauzeContractuale("Clauza2");
        System.out.println(contract);
        manager.adaugaVersiune(contract.saveToMemento());

        VersiuneContractTest test= new VersiuneContractTest();
        test.testConstructorAndGetClauzeContractuale();
    }
}