package exc3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        MyDictionary<String, String> dictionaryList = new MyDictionary<>("fist", "pair");
        MyDictionary<String, String> dictionaryList1 = new MyDictionary<>("second", "pair");
        MyDictionary<String, String> dictionaryList2 = new MyDictionary<>("third", "pair");

        System.out.println(dictionaryList.getType1());
        dictionaryList.getType2();

        ArrayList<MyDictionary<String, String>> list = new ArrayList<MyDictionary<String, String>>();

        list.add(dictionaryList);
        list.add(dictionaryList1);
        list.add(dictionaryList2);

        System.out.println("Общее количество пар элементов- " + list.size());
        System.out.println("выводим нулевой элемент - " + list.get(0));
        System.out.println("Выводим содержимое: \n" + list);


    }
}
