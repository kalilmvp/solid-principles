package dip;

/**
 * Dependency Inversion Principle
 */
public class Test {

    public static void main(String[] args) {
        System.out.println(
                new PriceCalculator(
                        new DefaultPriceTable(),
                        new FareBrazil())
                .calculate(new Product("SAO PAULO", 1000)));
    }
}
