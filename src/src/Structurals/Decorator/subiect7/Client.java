package Structurals.Decorator.subiect7;

public class Client {
    private final String id;
    private final String address;

    public Client(String id, String address) {
        this.id = id;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }
}
