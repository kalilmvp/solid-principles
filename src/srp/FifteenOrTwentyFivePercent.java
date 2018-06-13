package srp;

public class FifteenOrTwentyFivePercent implements Rules {

    @Override
    public double calculate(Employee employee) {
        if(employee.getSalary() > 2000.0) {
            return employee.getSalary() * 0.75;
        }
        else {
            return employee.getSalary() * 0.85;
        }
    }
}
