package exc5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner db = new Scanner(System.in);
        System.out.print("Введите радиус круга: ");
        double radius = db.nextDouble();
        MyArea.areaOfCircle(radius);
    }
}
