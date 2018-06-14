package ocp;

import java.util.ArrayList;
import java.util.List;

/**
 * Open Closed Principle
 */
public class Test {
    public static void main(String[] args) {
        List<ActionPostInvoiceGenerator> actions = new ArrayList<>();
        actions.add(new InvoiceDao());
        System.out.println(new InvoiceGenerator(actions).generate(new Bill(1000, "Any client")));
    }
}
