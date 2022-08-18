package exc2;

public class XMLHandler extends AbstractHandler {

    public void open() {
        System.out.println("XMLHandler open");

    }

    public void create() {
        System.out.println("XMLHandler is create");
    }

    void change() {
        System.out.println("XMLHandler is change");
    }

    public void save() {
        System.out.println("XMLHandler is save");
    }

}
