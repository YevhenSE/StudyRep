package exc6;


public class Main {

    public static final String reset = "\u001B[0m";
    public static final String black = "\u001B[30m";
    public static final String red = "\u001B[31m";
    public static final String green = "\u001B[32m";
    public static final String yellow = "\u001B[33m";
    public static final String blue = "\u001B[34m";

    public static void main(String[] args) {

        Printer black = new Black();
        black.print(Main.black);

        Printer blue = new Blue();
        blue.print(Main.blue);

        Printer yellow = new Yellow();
        yellow.print(Main.yellow);

        Printer red = new Red();
        red.print(Main.red);

        Printer green = new Green();
        green.print(Main.green);

    }
}
