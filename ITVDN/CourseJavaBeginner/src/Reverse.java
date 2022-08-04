import java.lang.Integer;
import java.util.Scanner;


public class Reverse {

    static int myReverse(int number) {

        String numberString = Integer.toString(number); //перевод числа в строку
        char[] array;
        array = numberString.toCharArray(); //перевод строки в массив символов

        for (int i = 0; i < array.length; i++) {

            if (array[i] == '0') {
                System.out.print("Введено число содержит ноль: ");
                return number;
            }
        }

        int numbersOfArray = array.length;
        for (int i = 0; i < numbersOfArray / 2; i++) {
            char value = array[numbersOfArray - i - 1];
            array[numbersOfArray - i - 1] = array[i];
            array[i] = value;
        }
        String str = new String(array); //перевод массива в строку

        number = Integer.parseInt(str); //Перевод строки в int

        System.out.print("Перевернутое число: ");
        return number;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите число, которое необходимо перевернуть, не содержащее нолей: ");
        int number = in.nextInt();

        if ((number >= -9) && (number <= 9)) {
            System.out.println("Введена число в промежутках от [-9:9]: " + number + "переворачивать нечего");
        } else if (number < -9) {
            number = Math.abs(number);
            number = myReverse(number);
            System.out.println(number * -1);
        } else {
            number = myReverse(number);
            System.out.println(number);
        }
    }
}
