package ocp;

public class EmailSender implements ActionPostInvoiceGenerator{

    public void execute(Invoice iv) {
        System.out.println("Email sent");
    }
}
