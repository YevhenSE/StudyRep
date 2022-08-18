package exc3;

public class Ship extends Vehicle {
    public String homePort = "Odessa";
    public int numberOfPass = 325;

    public Ship() {
    }

    public Ship(double price, double speed, int years, String homePort, int numberOfPass) {
        super(price, speed, years);
        homePort = homePort;
        numberOfPass = numberOfPass;
    }

}
