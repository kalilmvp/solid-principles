package lsp;

public class StudentAccount extends OrdinaryAccount{
    private MoneyManipulator manipulator;

    public StudentAccount() {
        this.manipulator = new MoneyManipulator();
    }

    private int miles;

    public void deposit(double value) {
        this.manipulator.deposit(value);
        this.miles += (int) value;
    }

    public int getMiles() {
        return miles;
    }
}
