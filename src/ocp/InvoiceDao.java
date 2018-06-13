package ocp;

public class InvoiceDao implements ActionPostInvoiceGenerator {
    public void execute(Invoice iv) {
        System.out.println("Data saved");
    }
}
