
package exc3;

public class Main {
    public static void main(String[] args) {

        Vehicles audi = Vehicles.Audi;
        System.out.println(audi);
        System.out.println(audi.getName() + " price in " + audi.getCurrency());

        System.out.println();

        Vehicles volkswagen = Vehicles.Volkswagen;
        System.out.println(audi);
        System.out.println(volkswagen.getName() + " price in " + volkswagen.getCurrency());
    }
}
