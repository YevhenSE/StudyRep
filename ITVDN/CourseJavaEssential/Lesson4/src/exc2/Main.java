package exc2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner str = new Scanner(System.in);

        System.out.print("Введите формат документа: ");
        String format = str.next();

        do {

            if (format.equals("EXIT")) break;

            if (format.equals("DOC")) {
                AbstractHandler doc = new DOCHandler();

                doc.create();
                doc.open();
                doc.change();
                doc.save();
                break;
            } else if (format.equals("TXT")) {
                AbstractHandler txt = new TXTHandler();
                txt.create();
                txt.open();
                txt.change();
                txt.save();
                break;
            } else if (format.equals("XML")) {
                AbstractHandler xml = new XMLHandler();
                xml.create();
                xml.open();
                xml.change();
                xml.save();
                break;
            } else
                System.out.println("Попробуйте еще раз, необходимо ввести XML, DOC, TXT \n Либо для выхода введите EXIT ");

            System.out.print("Введите формат документа");
            format = str.next();

        } while (true);

        if (format.equals("EXIT")) {
            System.out.println("Работа с документами не была выполнена");
        } else System.out.println("Работа с документами выполнена успешно");

    }

}
