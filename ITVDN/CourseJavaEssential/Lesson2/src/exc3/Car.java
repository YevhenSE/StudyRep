package exc3;

public class Car {
    private int age;
    private String colors;
    private double speed;


    public Car() {
        this.age = 14;
        this.colors = "White";
        this.speed = 185;
    }

    public Car(int age) {
        this.age = age;
        this.colors = "Green";
        this.speed = 215.0;
    }

    public Car(int age, String colors) {
        this.age = age;
        this.colors = colors;
        this.speed = 115;

    }

    public Car(int age, String colors, double speed) {
        this.age = age;
        this.colors = colors;
        this.speed = speed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColors() {
        return colors;
    }

    public void setColors(String colors) {
        this.colors = colors;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

}
