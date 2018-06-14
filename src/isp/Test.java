package isp;

/**
 * Interface Segregation Principle
 */
public class Test {
    public static void main(String[] args) {
        new Client().authenticate(new Card());
        new Employee().authenticate("employee1", "employee1");
    }
}
