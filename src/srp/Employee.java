package srp;

import java.util.Calendar;

public class Employee {
    private int id;
    private String name;
    private Role role;
    private Calendar admission;
    private double salary;

    public Employee(Role role, double salary) {
        this.role = role;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Role getRole() {
        return role;
    }

    public Calendar getAdmission() {
        return admission;
    }

    public double getSalary() {
        return salary;
    }

    public double calculateSalary() {
        return getRole().getRules().calculate(this);
    }
}
