package exc4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String pro = "pro";
        String expert = "exp";

        Scanner str = new Scanner(System.in);
        System.out.print("Введите ключ доступа: ");
        String key = str.next();

        if (key.equals(pro)) {

            DocumentWorker worker = new ProDocumentWorker();
            ProDocumentWorker worker1 = (ProDocumentWorker) worker;

            worker1.openDocument();
            worker1.editDocument();
            worker1.saveDocument();
        } else if (key.equals(expert)) {

            DocumentWorker worker = new ExpertDocumentWorker();
            ExpertDocumentWorker worker2 = (ExpertDocumentWorker) worker;
            worker2.openDocument();
            worker2.editDocument();
            worker2.saveDocument();

        } else {
            DocumentWorker worker = new DocumentWorker();
            worker.openDocument();
            worker.editDocument();
            worker.saveDocument();
        }
    }
}
