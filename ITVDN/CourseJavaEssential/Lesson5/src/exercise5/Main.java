package exercise5;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество учителей: ");
        int numberOfTeacher = in.nextInt();

        Scanner str = new Scanner(System.in);
        ArrayList<String> teacher = new ArrayList<>();

        for (int i = 0; i < numberOfTeacher; i++) {
            System.out.print("Ведите имя " + (i + 1) + "-го учителя: ");
            String name = str.next();
            teacher.add(i, name);
        }

        System.out.print("Введите имя лучшего учителя из введенного списка - "+teacher + ": ");
        String name2 = str.next();
        System.out.print("Введите имя худшего учителя из списка - "+teacher+": ");
        String name3 = str.next();

        System.out.println("индекс в списке лучшего учителя: " + teacher.indexOf(name2));
        System.out.println("индекс в списке худшего учителя: " + teacher.indexOf(name3));

    }
}
