package exc2;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car();
        Car car2 = new Car(15);
        Car car3 = new Car(15, "Green");

        System.out.println("Авто 1, год: " + car1.getAge() + ", цвет: " + car1.getColors());
        System.out.println("Авто 1, год: " + car2.getAge() + ", цвет: " + car2.getColors());
        System.out.println("Авто 1, год: " + car3.getAge() + ", цвет: " + car3.getColors());
    }
}
