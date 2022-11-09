package abstractfactory;

public class MobileFactory extends AbstractDeviceFactory{
    @Override
    Device getGadgets(DeviceType deviceType) {
        switch (deviceType){
            case NOKIA:
                return new Nokia("4GB", "Qualcomm");
            case ONEPLUS:
                return new OnePlus("4GB", "MediaTek");
            default:
                return null;
        }
    }
}
