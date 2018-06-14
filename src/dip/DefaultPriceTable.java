package dip;

public class DefaultPriceTable implements PriceTable {
    public double discountTo(double value) {
        System.out.println("Entered Default");
        if(value>5000) return 0.03;
        if(value>1000) return 0.05;
        return 0;
    }
}
