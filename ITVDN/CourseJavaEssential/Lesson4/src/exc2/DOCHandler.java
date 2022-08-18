package exc2;

public class DOCHandler extends AbstractHandler {

    public void open() {
        System.out.println("DocHandler open");

    }

    public void create() {
        System.out.println("DocHandler is create");
    }

    void change() {
        System.out.println("DocHandler is change");
    }

    public void save() {
        System.out.println("DocHandler is save");
    }

}
