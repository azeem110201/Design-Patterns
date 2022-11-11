package abstractfactory;

public class FactoryGenerator {
    public static AbstractDeviceFactory getFactory(FactoryType factoryType) {
        switch (factoryType) {
            case LAPTOP:
                return new LaptopFactory();
            case MOBILE:
                return new MobileFactory();
            default:
                return null;
        }
    }
}
