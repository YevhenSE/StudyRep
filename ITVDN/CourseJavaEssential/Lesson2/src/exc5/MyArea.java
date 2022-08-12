package exc5;

public class MyArea {

    private static final double Pi = 3.14;

    public static void areaOfCircle(double radius) {
        double s = (Pi * Math.pow(radius, 2));
        System.out.println("Площадь круга = " + s);
    }
}
