package ocp;

import java.util.List;

public class InvoiceGenerator {

    private final List<ActionPostInvoiceGenerator> actions;

    public InvoiceGenerator(List<ActionPostInvoiceGenerator> actions) {
        this.actions = actions;
    }

    public Invoice generate(Bill bill) {
        double value = bill.getValue();

        Invoice iv = new Invoice(value, value * 0.06);

        for (ActionPostInvoiceGenerator action : this.actions) {
            action.execute(iv);
        }

        return iv;
    }
}
