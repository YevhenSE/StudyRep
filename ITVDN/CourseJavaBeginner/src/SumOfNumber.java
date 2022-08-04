import java.util.Scanner;


public class SumOfNumber {

    static int mySumOfNumber(int number) {

        int summ = 0;
        if (number < 0) {
            number *= -1;
        }
        for (; number > 0; number /= 10) {
            summ += number % 10;
        }
        return summ;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scan.nextInt();

        int sum = mySumOfNumber(number);

        System.out.println("сумма всех цифр: " + sum);
    }
}

