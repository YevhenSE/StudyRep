package exc3;

public class Plane extends Vehicle {

    public double height=110;
    public int numberOfPass=125;
    public Plane(){};

    public Plane(double price, double speed, int years, int numberOfPass, double height) {
        super(price, speed, years);
       numberOfPass=numberOfPass;
        height = height;
    }



    }

