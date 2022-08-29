package exc3;


import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество магазинов: ");
        int numbersOfStore = in.nextInt();

        Price[] store = new Price[numbersOfStore];
        String[] storeName = new String[numbersOfStore];

        Scanner str = new Scanner(System.in);
        for (int i = 0; i < numbersOfStore; i++) {
            store[i] = new Price();
        }

        for (int i = 0; i < numbersOfStore; i++) {
            System.out.print("Введите название " + (i + 1) + " магазина: ");
            storeName[i] = str.nextLine();
        }
        Arrays.sort(storeName);
        //System.out.print(Arrays.toString(storeName));

        for (int i = 0; i < numbersOfStore; i++) {
            store[i].setStoreName(storeName[i]);
        }

        for (int i = 0; i < numbersOfStore; i++) {
            System.out.print("Введите название товара в магазине " + store[i].getStoreName() + " :");
            store[i].setProductName(str.nextLine());
            System.out.print("Введите стоимость товара " + store[i].getProductName() + " :");
            store[i].setPriceInUah(in.nextDouble());
        }

        System.out.print("Введите название магазина,для отображения товара и цены: ");
        String tempStoreName = str.nextLine();

        for (int i = 0; i < numbersOfStore; i++) {

            if (store[i].getStoreName().equals(tempStoreName)) {
                System.out.println(store[i].toString());

            } else if ((!store[i].getStoreName().equals(tempStoreName)) & (i == numbersOfStore - 1)) {
                try {
                    throw new Exception("Введенного магазина не существует");
                } catch (Exception e) {
                    System.out.println(e.getMessage());

                }

            }
        }
    }
}

