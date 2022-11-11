package template;

public class PUBG extends BaseGameLoader{
    @Override
    public byte[] loadLocalData() {
        System.out.println("Loading PUBG files...");
        return new byte[0];
    }

    @Override
    public void createObjects(byte[] data) {
        System.out.println("Creating PUBG objects...");
    }

    @Override
    public void downloadAdditionalFiles() {
        System.out.println("Downloading PUBG sounds...");
    }

    @Override
    public void initializeProfiles() {
        System.out.println("Loading PUBG profiles...");
    }
}
