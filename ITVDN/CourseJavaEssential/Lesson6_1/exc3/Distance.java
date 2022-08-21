package exc3;

public class Distance {
    private static double distance;


    static class Converter {

        public static double metersToMiles() {
            return (distance / 1000) * 0.624;
        }

        public static double metersToSeaMiles() {
            return (distance / 1000) * 0.53996;
        }

        public static double metersToKiloMeters() {
            return (distance / 1000);
        }

    }

    public void print() {
        System.out.println("Print");
    }

    ;

    public static double getDistance() {
        return distance;
    }

    public static void setDistance(double distance) {
        Distance.distance = distance;
    }
}
