class HospitalStaffSystem {
    private Doctor doctor;
    private Pharmacist pharmacist;
    private Manager manager;

    HospitalStaffSystem() {
        doctor = new Doctor("Dr. Sharma", 501, "General Medicine");
        pharmacist = new Pharmacist("Amit", 502, "D. Pharma");
        manager = new Manager("Pooja", 503, "Hospital Operations");
    }

    void displaySystem() {
        System.out.println("=== Hospital Staff System ===");
        doctor.displayDoctor();
        pharmacist.displayPharmacist();
        System.out.println("\nManager Details:");
        manager.displayManager();
    }
}

class Person {
    protected String name;

    Person(String name) {
        this.name = name;
    }

    void displayPerson() {
        System.out.println("Name: " + name);
    }
}

class Employee extends Person {
    protected int employeeId;

    Employee(String name, int employeeId) {
        super(name);
        this.employeeId = employeeId;
    }

    void displayEmployee() {
        displayPerson();
        System.out.println("Employee ID: " + employeeId);
    }
}

class Doctor extends Employee {
    private String specialization;

    Doctor(String name, int employeeId, String specialization) {
        super(name, employeeId);
        this.specialization = specialization;
    }

    void displayDoctor() {
        System.out.println("\nDoctor Details:");
        displayEmployee();
        System.out.println("Specialization: " + specialization);
    }
}

class Pharmacist extends Employee {
    private String qualification;

    Pharmacist(String name, int employeeId, String qualification) {
        super(name, employeeId);
        this.qualification = qualification;
    }

    void displayPharmacist() {
        System.out.println("\nPharmacist Details:");
        displayEmployee();
        System.out.println("Qualification: " + qualification);
    }
}

class Manager extends Employee {
    private String department;

    Manager(String name, int employeeId, String department) {
        super(name, employeeId);
        this.department = department;
    }

    void displayManager() {
        displayEmployee();
        System.out.println("Department: " + department);
    }
}

public class Q15_FinalHospitalStaffSystem {
    public static void main(String[] args) {
        HospitalStaffSystem system = new HospitalStaffSystem();
        system.displaySystem();
    }
}
