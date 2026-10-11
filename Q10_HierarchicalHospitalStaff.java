class Employee {
    protected String name;
    protected int employeeId;

    Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    void displayBasicDetails() {
        System.out.println("Name: " + name);
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
        System.out.println("Doctor Details:");
        displayBasicDetails();
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
        displayBasicDetails();
        System.out.println("Qualification: " + qualification);
    }
}

public class Q10_HierarchicalHospitalStaff {
    public static void main(String[] args) {
        Doctor doctor = new Doctor("Dr. Mehta", 301, "Cardiology");
        Pharmacist pharmacist = new Pharmacist("Riya", 302, "B. Pharma");
        doctor.displayDoctor();
        pharmacist.displayPharmacist();
    }
}
