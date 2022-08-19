package excercise2;

import java.util.ArrayList;
import java.util.Scanner;

public class Zoo {
    public static void main(String[] args) {


        Scanner str = new Scanner(System.in);

        ArrayList<String> zoo = new ArrayList<>();

        System.out.println("Необходимо ввести 8 животных");


        for (int i = 0; i < 8; i++) {
            System.out.print("Ведите " + (i + 1) + " животное: ");
            String name = str.next();
            zoo.add(i, name);

        }
        System.out.println("Всего " + zoo.size() + " элементов в списке");
        System.out.println(zoo);


    }
}

