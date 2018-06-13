package ocp;

public class Invoice {
    private Long id;
    private double gross;
    private double taxes;

    public Invoice(double gross, double taxes) {
        this.gross = gross;
        this.taxes = taxes;
    }

    public Invoice(Long id, double gross, double taxes) {
        this.id = id;
        this.gross = gross;
        this.taxes = taxes;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "id=" + id +
                ", gross=" + gross +
                ", taxes=" + taxes +
                '}';
    }

    public Long getId() {
        return id;
    }

    public double getGross() {
        return gross;
    }

    public double getTaxes() {
        return taxes;
    }
}
