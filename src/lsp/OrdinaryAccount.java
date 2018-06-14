package lsp;

public class OrdinaryAccount {
    private MoneyManipulator manipulator;

    public OrdinaryAccount() {
        this.manipulator = new MoneyManipulator();
    }

    public void deposit(double value) {
        this.manipulator.deposit(value);
    }

    public void profit() {
        this.manipulator.profit(0.01);
    }

    public void cashOut(double value) {
        this.manipulator.cashOut(value);
    }

    public double getBalance() {
        return this.manipulator.getBalance();
    }
}
