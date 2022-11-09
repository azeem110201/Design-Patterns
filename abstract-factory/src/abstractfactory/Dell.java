package abstractfactory;

public class Dell implements Device{
    private String ram;
    private String processor;

    private String gpu;

    public Dell(String ramSize, String processor, String gpu){
        this.ram = ramSize;
        this.processor = processor;
        this.gpu = gpu;
    }

    @Override
    public String getDetails() {
        return "Dell config is ram size: " + this.ram + " and processor type is " + this.processor + " and gpu type is " + this.gpu;
    }

    public String toString() {
        return "Dell("+"ram"+ram + ", processor" + processor + ", gpu" + gpu + ")";
    }
}
