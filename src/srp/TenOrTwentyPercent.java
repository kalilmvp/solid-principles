package srp;

public class TenOrTwentyPercent implements Rules {

    @Override
    public double calculate(Employee employee) {
        if(employee.getSalary() > 3000.0) {
            return employee.getSalary() * 0.8;
        }
        else {
            return employee.getSalary() * 0.9;
        }
    }
}
