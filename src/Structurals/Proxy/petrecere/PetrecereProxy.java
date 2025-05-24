package petrecere;

public class PetrecereProxy implements IPetrecere{
    private Petrecere petrecere;

    public PetrecereProxy(Petrecere petrecere){
        super();
        this.petrecere=petrecere;
    }

    @Override
    public void adaugaParticiant(Client c1) {
        if(c1.getVarsta()>=18){
            petrecere.adaugaParticiant(c1);
        }else{
            System.out.println("Clientul "+c1.getName()+ "nu are varsta minima de 18 ani");
        }
    }

    @Override
    public void afisareProgram() {
this.petrecere.afisareProgram();
    }
}
