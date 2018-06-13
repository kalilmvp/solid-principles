package srp;

public class SalaryCalculator {

    public double calculate(Employee employee) {
        return employee.calculateSalary();
    }

    public static void main(String[] args) {
        System.out.println(new SalaryCalculator().calculate(new Employee(Role.TESTER, 3000)));
    }
}
