package dip;

public class Product {
    private String city;
    private double value;

    public Product(String city, double value) {
        this.city = city;
        this.value = value;
    }

    public String getCity() {
        return city;
    }

    public double getValue() {
        return value;
    }
}
