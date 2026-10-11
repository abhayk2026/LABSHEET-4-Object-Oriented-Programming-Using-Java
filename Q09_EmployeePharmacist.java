class Employee {
    protected String name;
    protected int employeeId;

    Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    void displayEmployee() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + employeeId);
    }
}

class Pharmacist extends Employee {
    private String qualification;

    Pharmacist(String name, int employeeId, String qualification) {
        super(name, employeeId);
        this.qualification = qualification;
    }

    void displayPharmacist() {
        displayEmployee();
        System.out.println("Qualification: " + qualification);
    }
}

public class Q09_EmployeePharmacist {
    public static void main(String[] args) {
        Pharmacist pharmacist =
            new Pharmacist("Neha Verma", 205, "B. Pharma");
        pharmacist.displayPharmacist();
    }
}
