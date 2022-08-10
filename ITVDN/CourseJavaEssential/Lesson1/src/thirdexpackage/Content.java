package thirdexpackage;

public class Content {
    private String content;

    public Content() {
    }

    public void setContent(String content) {
        this.content = content;
    }

    void show() {
        System.out.println("Содержание книги:");
        System.out.println("      " + content);
    }
}
