package template;

public class CallOfDuty extends BaseGameLoader{
    @Override
    public byte[] loadLocalData() {
        System.out.println("Loading local COD files...");
        return new byte[0];
    }

    @Override
    public void createObjects(byte[] data) {
        System.out.println("Creating COD objects...");
    }

    @Override
    public void downloadAdditionalFiles() {
        System.out.println("Downloading COD sounds...");
    }

    @Override
    public void initializeProfiles() {
        System.out.println("Loading COD profiles...");
    }
}
