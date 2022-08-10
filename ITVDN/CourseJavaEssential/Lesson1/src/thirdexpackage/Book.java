package thirdexpackage;

import java.util.Scanner;

public class Book {
    public static void main(String[] args) {

        Title title = new Title();
        Content content = new Content();
        Author author = new Author();

        Scanner str = new Scanner(System.in);
        System.out.print("Введите название книги: ");
        title.setTitle(str.nextLine());

        System.out.println("Введите содержание");
        content.setContent(str.nextLine());

        System.out.print("Введите автора книги: ");
        author.setAuthor(str.nextLine());

        title.show();
        content.show();
        author.show();
    }
}
