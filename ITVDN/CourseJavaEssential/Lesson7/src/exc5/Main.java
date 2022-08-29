package exc5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int firstParameter = in.nextInt();
        System.out.print("Введите второе число: ");
        int secondParameter = in.nextInt();

        Calculator calc = new Calculator();
        calc.setFirstParameter(firstParameter);
        calc.setSecondParameter(secondParameter);

        Scanner str = new Scanner(System.in);
        System.out.print("Введите операцию :");
        String operand = str.next();
        switch (operand) {
            case "+":
                calc.Addition();
                break;
            case "-":
                System.out.println("Результат вычитания" + calc.Subtraction());
                break;
            case "*":
                System.out.println("Результат умножения" + calc.Multiplication());
                break;
            case "/":
                calc.Division();
                break;
            default:
                try {
                    throw new Exception("Не верно введенная операция");
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                break;
        }

    }
}
