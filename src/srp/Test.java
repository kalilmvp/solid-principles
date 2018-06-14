package srp;

/**
 * Single Responsability Principle
 */
public class Test {
    public static void main(String[] args) {
        System.out.println(new SalaryCalculator().calculate(new Employee(Role.TESTER, 3000)));
    }
}
