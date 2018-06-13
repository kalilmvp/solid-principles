package ocp;

public class Bill {
    private double value;
    private String client;

    public Bill(double value, String client) {
        this.value = value;
        this.client = client;
    }

    public double getValue() {
        return value;
    }

    public String getClient() {
        return client;
    }
}
