package lsp;

public class MoneyManipulator {
    private double balance = 0;

    public void deposit(double value) {
        this.balance += value;
    }

    public void profit(double tax) {
        this.balance += this.balance * tax;
    }

    public void cashOut(double value) {
        if (value <= this.balance) {
            this.balance -= value;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public double getBalance() {
        return balance;
    }
}
