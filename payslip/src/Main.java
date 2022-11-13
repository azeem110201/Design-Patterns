public class Main {
    public static void main(String[] args) {
        Payslip payslip = new PayslipBuilder().setHra(10).setDa(75).getPaySlip();

        System.out.println(payslip);

        System.out.println(payslip.calculateNetSalary(20000));
    }
}
