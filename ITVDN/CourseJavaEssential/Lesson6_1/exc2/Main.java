package exc2;

public class Main {
    public static void main(String[] args) {

        Vehicle.Wheel wheel = new Vehicle().new Wheel();
        wheel.print();

        Vehicle.Door door = new Vehicle().new Door();
        door.print();

        Vehicle vehicle = new Vehicle();
        vehicle.print();
    }
}
