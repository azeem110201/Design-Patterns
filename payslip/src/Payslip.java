public class Payslip {
    private double hra;
    private double da;
    private double incomeTax;

    public Payslip(double hra, double da, double incomeTax) {
        this.hra = hra;
        this.da = da;
        this.incomeTax = incomeTax;
    }

    @Override
    public String toString() {
        return "Payslip{" +
                "hra=" + hra +
                ", da=" + da +
                ", incomeTax=" + incomeTax +
                '}';
    }

    public double calculateNetSalary(double basicSalary){
        double calculatedHra = (this.hra / 100) * basicSalary;
        double calculatedDA = (this.da / 100) * basicSalary;
        double calculatedGS = basicSalary + calculatedDA + calculatedHra;
        double incometax = (this.incomeTax / 100) * calculatedGS;
        double netsalary= calculatedGS - incometax;
        
        return netsalary;
    }
}
