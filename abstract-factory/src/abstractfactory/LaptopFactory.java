package abstractfactory;

public class LaptopFactory extends AbstractDeviceFactory{
    @Override
    Device getGadgets(DeviceType deviceType) {
        switch (deviceType) {
            case HP:
                return new HP("8GB", "intel", "Nvidia 3080");
            case DELL:
                return new Dell("16GB", "intel", "Nvidia RTX 1080");
            default:
                return null;
        }
    }
}
