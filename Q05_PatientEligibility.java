class Patient {
    private String name;
    private int age;

    Patient(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void checkEligibility() {
        System.out.println("Patient: " + name);
        if (age >= 18) {
            System.out.println("Classification: Adult patient");
        } else {
            System.out.println("Classification: Minor patient");
        }
    }
}

public class Q05_PatientEligibility {
    public static void main(String[] args) {
        Patient patient = new Patient("Aman", 20);
        patient.checkEligibility();
    }
}
