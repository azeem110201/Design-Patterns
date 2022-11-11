package composite;

public class Main {
    public static void main(String[] args) {
        Developer dev1 = new Developer(100, "ABC", "Pro Developer");
        Developer dev2 = new Developer(101, "XYZ", "Developer");
        Directory devDirectory = new Directory();
        devDirectory.addEmployee(dev1);
        devDirectory.addEmployee(dev2);

        Designer man1 = new Designer(200, "QWERTY", "Graphic Designer");
        Designer man2 = new Designer(201, "MNOP", "UI/UX designer");
        Directory designerDirectory = new Directory();
        designerDirectory.addEmployee(man1);
        designerDirectory.addEmployee(man2);

        Tester test1 = new Tester(300, "JOHN", "Selenium Tester");
        Tester test2 = new Tester(301, "MARRY", "Cypress Tester");
        Directory testerDirectory = new Directory();
        testerDirectory.addEmployee(man1);
        testerDirectory.addEmployee(man2);

        Directory directory = new Directory();
        directory.addEmployee(devDirectory);
        directory.addEmployee(designerDirectory );
        directory.addEmployee(testerDirectory);
        directory.showEmployeeDetails();
    }
}
