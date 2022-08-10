package thirdexpackage;

public class Author {

    private String author;

    public Author() {
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    void show() {
        System.out.println("Автор книги:" + author);
    }

}
