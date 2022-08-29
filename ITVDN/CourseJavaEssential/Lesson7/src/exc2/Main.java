package exc2;


import java.util.*;


public class Main {
    public static void main(String[] args) {

        int year = 2022;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество сотрудников: ");
        int numbersOfEmployee = in.nextInt();

        Worker[] workers = new Worker[numbersOfEmployee];
        String[] name = new String[numbersOfEmployee];

        Scanner str = new Scanner(System.in);
        for (int i = 0; i < numbersOfEmployee; i++) {
            workers[i] = new Worker();
        }

        for (int i = 0; i < numbersOfEmployee; i++) {
            System.out.print("Введите фамилию и инициалы " + (i + 1) + "-го сотрудника: ");
            name[i] = str.nextLine();

        }
        Arrays.sort(name);

        for (int i = 0; i < numbersOfEmployee; i++) {
            workers[i].setName(name[i]);
        }

        for (int i = 0; i < numbersOfEmployee; i++) {
            System.out.print("Введите должность " + workers[i].getName() + ": ");
            workers[i].setJobTitle(str.nextLine());
        }

        for (int i = 0; i < numbersOfEmployee; i++) {

            System.out.print("Ввести год поступления " + workers[i].getName() + " на должность " + workers[i].getJobTitle() + ": ");
            workers[i].setYearOfEmployment(in.nextInt());
        }

        for (int i = 0; i < numbersOfEmployee; i++) {

            if ((year < workers[i].getYearOfEmployment()) || (workers[i].getYearOfEmployment() < (year - 50)))
                try {
                    throw new Exception("не верно введенная дата устройства на работу: " + workers[i].getYearOfEmployment() + " год");
                } catch (Exception e) {
                    System.out.println("Для работника - " + workers[i].getName() + "  " + e.getMessage());

                }
            else System.out.println(workers[i].toString());
        }
    }
}






