package abstractfactory;

public class Main {
    public static void main(String[] args) {
        Device dell = FactoryGenerator.getFactory(FactoryType.LAPTOP).getGadgets(DeviceType.DELL);

        System.out.println(dell.getDetails());

        AbstractDeviceFactory mobileFactory = FactoryGenerator.getFactory(FactoryType.MOBILE);

        Device nokia = mobileFactory.getGadgets(DeviceType.NOKIA);
        System.out.println(nokia.getDetails());
        System.out.println(nokia.toString());
    }
}
