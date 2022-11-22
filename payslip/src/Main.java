public class Main {
    public static void main(String[] args) {
        Payslip payslip = new Payslip(10, 75, 0);

        System.out.println(payslip);

        System.out.println(payslip.calculateNetSalary(20000));
    }
}
