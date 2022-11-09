package abstractfactory;

public class OnePlus implements Device{
    private String ram;
    private String processor;

    public OnePlus(String ramSize, String processor){
        this.ram = ramSize;
        this.processor = processor;
    }

    @Override
    public String getDetails() {
        return "OnePlus config is ram size: " + this.ram + " and processor type is " + this.processor;
    }

    public String toString() {
        return "OnePlus("+"ram"+ram + ", processor" + processor + ")";
    }
}
