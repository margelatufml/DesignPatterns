package petrecere;

public class Client {
    private String name;
    private Integer varsta;

    public Client(String name, Integer varsta) {
        this.name = name;
        this.varsta = varsta;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", varsta=" + varsta +
                '}';
    }

    public String getName() {
        return name;
    }

    public Integer getVarsta() {
        return varsta;
    }
}
