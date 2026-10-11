class Medicine {
    private String name;
    private double price;

    Medicine(String name, double price) {
        this.name = name;
        this.price = price;
    }

    void display() {
        System.out.println("Medicine Name: " + name);
        System.out.printf("Price: Rs. %.2f%n", price);
    }
}

public class Q02_Medicine {
    public static void main(String[] args) {
        Medicine medicine = new Medicine("Paracetamol", 25.50);
        medicine.display();
    }
}
