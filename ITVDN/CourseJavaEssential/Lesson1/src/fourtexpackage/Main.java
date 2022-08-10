package fourtexpackage;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ComputerData[] computers = new ComputerData[5];

        String data;
        computers[0] = new ComputerData();
        computers[1] = new ComputerData();
        computers[2] = new ComputerData();
        computers[3] = new ComputerData();
        computers[4] = new ComputerData();

        Scanner str = new Scanner(System.in);

        for (int i = 0; i < computers.length; i++) {
            System.out.print("Введите " + (i + 1) + " экземпляр в компьютер:");
            computers[i].setData(str.nextLine());
            data = computers[i].getData();
        }
        System.out.println();
        System.out.println("Вывод всех экземпляров, записанных в компьютер: ");

        for (int i = 0; i < computers.length; i++) {
            System.out.println("computers[" + i + "]: " + computers[i].getData());
        }
    }

}

