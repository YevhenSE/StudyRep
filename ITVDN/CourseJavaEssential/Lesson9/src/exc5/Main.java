package exc5;

public class Main {
    public static void main(String[] args) throws Exception {

        IceCreamFactory iceCreamFactory = createIceCreamBy("chocolate");
        IceCream iceCream = iceCreamFactory.createIceCream();
        iceCream.productIceCream();

    }

    //Create factory method
    static IceCreamFactory createIceCreamBy(String spec) throws Exception {
        if (spec.equalsIgnoreCase("chocolate")) {
            return new ChocolateIceCreamFactory();
        } else if (spec.equalsIgnoreCase("cream")) {
            return new CreamIceCreamFactory();
        } else {
            throw new Exception(spec + "  IceCream don't produce");
        }
    }
}
