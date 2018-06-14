package lsp;

import java.util.Arrays;
import java.util.List;

/**
 * Liskov Substitutive Principle (Favors Composition instead of Inheritage)
 */
public class InvestmentProcessor {

    public static void main(String[] args) {
        for (OrdinaryAccount oc : bankAccounts()) {
            oc.profit();

            System.out.println("New balance " + oc.getBalance());
        }
    }

    private static List<OrdinaryAccount> bankAccounts() {
        return Arrays.asList(anAccountWith(100), anAccountWith(150), contaDeEstudanteCom(200));
    }

    private static OrdinaryAccount anAccountWith(double value) {
        OrdinaryAccount c = new OrdinaryAccount();
        c.deposit(value);
        return c;
    }

    private static OrdinaryAccount contaDeEstudanteCom(double amount) {
        StudentAccount c = new StudentAccount();
        c.deposit(amount);
        return c;
    }
}
