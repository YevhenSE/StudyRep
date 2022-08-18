package exc6;

public class Black extends Printer {

    public Black() {
    }

    public void print(String value) {

        System.out.println(value + "текст черным" + Main.reset);
    }
}
