package thirdexpackage;

public class Title {

    private String title;

    public Title() {
    }

    public void setTitle(String title) {
        this.title = title;
    }

    void show() {
        System.out.println("Название книги: " + title);
    }
}
