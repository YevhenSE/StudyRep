import java.util.Scanner;

public class Data {
    public static void main(String[] args) {
        String data;

        Scanner str = new Scanner(System.in);
        System.out.print("Введите дату в формате dd/mm/yy: ");
        data = str.nextLine();

        char[] array = data.toCharArray();
        int sum = 0;

        if (array.length != 10) {
            System.out.println("Не правильный формат ввода");
        } else {
            for (int i = 0; i < array.length; i++) {

                for (char j = '0'; j <= '9'; j++) {
                    if (array[i] == j) {
                        sum = sum + Character.digit(array[i], 10);  //переводит число в десятичную систему
                    }
                }
            }
            System.out.println("сумма чисел даты: " + sum);

        }
    }
}

