package Subiect06;

public class Order {
    private String restaurantName;
    private Double kmDistance;
    private Double price;

    public Order(String restaurantName, Double kmDistance, Double price) {
        this.restaurantName = restaurantName;
        this.kmDistance = kmDistance;
        this.price = price;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public Double getPrice() {
        return price;
    }

    public Double getKmDistance() {
        return kmDistance;
    }

    @Override
    public String toString() {
        return "Order{" +
                "restaurantName='" + restaurantName + '\'' +
                ", kmDistance=" + kmDistance +
                ", price=" + price +
                '}';
    }
}
