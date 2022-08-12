package exc4;


public class Main {
    public static void main(String[] args) {

        Car car1 = new Car();
        Car car2 = new Car(22);
        Car car3 = new Car(25, "Yellow");
        Car car4 = new Car(35, "Black", 220.0);

        System.out.println("Авто 1, год: " + car1.getAge() + ", цвет: " + car1.getColors() + ", скорость: " + car1.getSpeed());
        System.out.println("Авто 2, год: " + car2.getAge() + ", цвет: " + car2.getColors() + ",  скорость: " + car2.getSpeed());
        System.out.println("Авто 3, год: " + car3.getAge() + ", цвет: " + car3.getColors() + ", скорость: " + car3.getSpeed());
        System.out.println("Авто 4, год: " + car4.getAge() + ", цвет: " + car4.getColors() + ",  скорость: " + car4.getSpeed());

    }
}
