package abstractfactory;

public class Nokia implements Device{
    private String ram;
    private String processor;

    public Nokia(String ramSize, String processor){
        this.ram = ramSize;
        this.processor = processor;
    }

    @Override
    public String getDetails() {
        return "Nokia config is ram size: " + this.ram + " and processor type is " + this.processor;
    }

    public String toString() {
        return "Nokia("+"ram"+ram + ", processor" + processor + ")";
    }
}
