package exc5;

public class CreamIceCreamFactory implements IceCreamFactory {
    @Override
    public IceCream createIceCream() {
        return new CreamIceCream();
    }
}
