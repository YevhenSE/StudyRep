package fifthexpackage;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Address address= new Address(); *----Variant 2
        Address address = new Address(0, null, null, 0, 0); //Передаем начальные данные в класс

        Scanner sc = new Scanner(System.in);
        Scanner scInt = new Scanner(System.in);

        System.out.print("Введите название страны:");
        address.setCountry(sc.next());
        String country = address.getCountry();

        System.out.print("Введите почтовый индекс:");
        address.setIndex(scInt.nextInt());
        int index = address.getIndex();

        System.out.print("Введите название улицы:");
        address.setStreet(sc.next());
        String street = address.getStreet();

        System.out.print("Введите номер дома:");
        address.setHouse(scInt.nextInt());
        int house = address.getHouse();

        System.out.print("Введите номер квартиры:");
        address.setApartment(scInt.nextInt());
        int apartment = address.getApartment();

        System.out.println("Address: " + index + ", " + country + ", " + street + " street " + house + "," + apartment); //Вывод с помощью getter
        address.viewAddress(); // Вывод с помощью метода
    }
}
