package isp;

public class Client implements AutenticableWithCard{
    @Override
    public void authenticate(Card card) {
        System.out.println("here card");
    }
}
