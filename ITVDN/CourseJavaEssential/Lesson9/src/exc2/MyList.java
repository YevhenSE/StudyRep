package exc2;

import java.util.ArrayList;
import java.util.List;

public class MyList<T> {

    private ArrayList<T> myArrayList;
    int number;

    public MyList() {
        myArrayList = new ArrayList<>();
    }

    public void add(T set) {
        myArrayList.add(set);

    }

    public void indexOf(int number) {
        this.number = number;

        System.out.println(" значение " + number + "-го элемента - " + myArrayList.get(number));
        System.out.println("размер массива - " + myArrayList.size());
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "myArrayList=" + myArrayList +
                '}';
    }
}
