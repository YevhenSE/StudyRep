package exc2;

public class Car {

    private int age;
    private String colors;

    public Car() {
        this.age = 20;
        this.colors = "blue";
    }

    public Car(int age) {
        this.age = age;
    }

    public Car(int age, String colors) {
        this.age = age;
        this.colors = colors;
    }

    public int getAge() {
        return age;
    }

    public String getColors() {
        return colors;
    }
}
