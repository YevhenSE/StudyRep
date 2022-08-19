package excercise3;

import java.util.ArrayList;
import java.util.Scanner;

public class Zoo {

    public static void main(String[] args) {

        Scanner str = new Scanner(System.in);
        ArrayList<String> zoo = new ArrayList<>();

        for (int i = 0; i < 8; i++) {
            System.out.print("Ведите " + (i + 1) + " животное: ");
            String name = str.next();
            zoo.add(i, name);
        }

        System.out.println("Всего " + zoo.size() + " элементов в списке");
        System.out.println(zoo);
        System.out.println();

        int count = 3;
        for (int i = 3; i < 6; i++) {
            zoo.remove(i);
            System.out.println("удален " + count + " элемент из исходного списка " + zoo);
            System.out.println("новый размер списка " + zoo.size());
            System.out.println();
            count = count + 2;
        }
    }
}


