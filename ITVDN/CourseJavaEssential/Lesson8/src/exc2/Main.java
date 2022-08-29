package exc2;

public class Main {

    public static void main(String[] args) {

        EthernetAdapter adapter = new EthernetAdapter();
        Device device = new Device();
        Monitor monitor = new Monitor();

        System.out.println(monitor.toString());
        System.out.println(device.toString());
        System.out.println(adapter.toString());

        System.out.println(monitor.equals(monitor));
        System.out.println(monitor.equals(device));
        System.out.println(adapter.equals(adapter));

        System.out.println(device.hashCode());
        System.out.println(adapter.hashCode());
        System.out.println(monitor.hashCode());

    }

}
