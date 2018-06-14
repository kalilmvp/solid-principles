package isp;

public class Employee implements AutenticableWithPassword {
    @Override
    public void authenticate(String login, String password) {
        System.out.println("here login and password");
    }
}
