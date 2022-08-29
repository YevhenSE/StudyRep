package exc5;

public class Calculator {

    private int firstParameter;
    private int secondParameter;
    private int result;

    public void Addition() {
        result = firstParameter + secondParameter;
        System.out.println("Результат сложения: " + result);
    }

    public int Subtraction() {
        return firstParameter + secondParameter;
    }

    public int Multiplication() {
        return firstParameter * secondParameter;
    }

    public void Division() {
        try {
            result = firstParameter / secondParameter;
            System.out.println("Результат деления: " + result);

        } catch (Exception e) {
            System.out.println("Деление на ноль " + e.getMessage());
        }

    }

    public void setFirstParameter(int firstParameter) {
        this.firstParameter = firstParameter;
    }

    public void setSecondParameter(int secondParameter) {
        this.secondParameter = secondParameter;
    }
}
