package exc2;

public class TXTHandler extends AbstractHandler {

    public void open() {
        System.out.println("TXTHandler open");

    }

    public void create() {
        System.out.println("TXTHandler is create");
    }

    void change() {
        System.out.println("TXTHandler is change");
    }

    public void save() {
        System.out.println("TXTHandler is save");
    }

}
