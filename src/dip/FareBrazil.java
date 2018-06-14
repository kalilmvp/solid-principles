package dip;

public class FareBrazil implements FareIF{
    public double to(String city) {
        System.out.println("Entered Fare Brazil");
        if("SAO PAULO".equals(city.toUpperCase())) {
            return 15;
        }
        return 30;
    }
}
