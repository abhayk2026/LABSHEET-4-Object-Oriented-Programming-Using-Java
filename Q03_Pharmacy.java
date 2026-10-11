class Pharmacy {
    static String pharmacyName = "City Care Pharmacy";
    static String location = "Muzaffarnagar";

    void display() {
        System.out.println("Pharmacy: " + pharmacyName);
        System.out.println("Location: " + location);
    }
}

public class Q03_Pharmacy {
    public static void main(String[] args) {
        Pharmacy first = new Pharmacy();
        Pharmacy second = new Pharmacy();

        first.display();

        // A static field is shared by every object of the class.
        second.pharmacyName = "Health Plus Pharmacy";
        System.out.println("\nAfter changing the static name through second object:");
        first.display();
    }
}
