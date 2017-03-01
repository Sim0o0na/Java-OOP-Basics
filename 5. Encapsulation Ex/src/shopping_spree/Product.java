package shopping_spree;

/**
 * Created by Simona Simeonova on 25-Feb-17.
 */
public class Product {
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Money cannot be negative");
        }
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() < 1 || name.charAt(0) == ' ') {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    private double price;
    private String name;

    public Product(String name, double price){
        this.setName(name);
        this.setPrice(price);
    }

}
