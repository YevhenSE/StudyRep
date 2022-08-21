package exc3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner db = new Scanner(System.in);
        System.out.println("Введите значение метров для конвертации: ");
        double distance = db.nextDouble();
        Distance.setDistance(distance);

        Distance.Converter convert = new Distance.Converter();
        System.out.println(Distance.getDistance() + " meters = " + convert.metersToMiles() + " miles");
        System.out.println(Distance.getDistance() + " meters = " + convert.metersToSeaMiles() + " sea miles");
        System.out.println(Distance.getDistance() + " meters = " + convert.metersToKiloMeters() + "kilometers");

    }
}
