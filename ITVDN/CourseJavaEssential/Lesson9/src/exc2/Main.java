package exc2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        MyList<String> variable = new MyList<>();

        //add five element in List
        variable.add("first element");
        variable.add("second element");
        variable.add("third element");
        variable.add("fives element");

        variable.setNumber(2);

        variable.indexOf(2);

        System.out.println(variable.toString());


    }
}
