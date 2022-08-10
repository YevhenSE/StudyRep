package secondexpackage;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Rectangle rect = new Rectangle();
        Scanner doub = new Scanner(System.in);
        System.out.print("Введите сторону прямоугольника: ");
        double side1 = doub.nextDouble();
        System.out.print("Введите сторону прямоугольника: ");
        double side2 = doub.nextDouble();

        double area = rect.areaCalculator(side1, side2);
        double perimeter = rect.perimeterCalculator(side1, side2);

        System.out.println("Площадь прямоугольника= " + area);
        System.out.println("Периметр прямоугольника= " + perimeter);

    }
}