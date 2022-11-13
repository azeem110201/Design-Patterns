public class PayslipBuilder {
    private double hra;
    private double da;
    private double incomeTax;

    PayslipBuilder setHra(double hra){
        this.hra = hra;
        return this;
    }

    PayslipBuilder setDa(double da){
        this.da = da;
        return this;
    }

    PayslipBuilder setIncomeTax(double incomeTax){
        this.incomeTax = incomeTax;
        return this;
    }

    Payslip getPaySlip(){
        return new Payslip(hra, da, incomeTax);
    }
}
