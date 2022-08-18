package exc3;

public class Main {

    public static void main(String[] args) {
        // Car veh1 = new Car(10,10,10);
        Car car = new Car();
        Plane plane = new Plane();
        Ship ship = new Ship();

        System.out.println("Цена авто - " + car.price + ". скорость авто - " + car.speed + ". год выпуска авто - " + car.years);
        System.out.println("Цена самолета - " + plane.price + ". год выпуска -  " + plane.years + ". скорость -   " + plane.speed + " количество пассажиров - " + plane.numberOfPass + " высота - " + plane.height);
        System.out.println("Цена авто - " + ship.price + ". скорость авто - " + ship.speed + " год выпуска авто - " + car.years + ". домашний порт - " + ship.homePort + ". количество пассажиров - " + ship.numberOfPass);

    }

}
