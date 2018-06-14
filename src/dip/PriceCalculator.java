package dip;

public class PriceCalculator {
    private PriceTable priceTable;
    private FareIF fare;

    public PriceCalculator(PriceTable priceTable, FareIF fare) {
        this.priceTable = priceTable;
        this.fare = fare;
    }

    public double calculate(Product product) {
        double discount = this.priceTable.discountTo(product.getValue());
        double fareTo = this.fare.to(product.getCity());

        return (product.getValue() * (1 - discount)) + fareTo;
    }
}
