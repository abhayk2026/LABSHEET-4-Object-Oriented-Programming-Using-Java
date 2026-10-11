class MedicineStock {
    private String medicineName;
    private int quantity;

    MedicineStock(String medicineName, int quantity) {
        this.medicineName = medicineName;
        this.quantity = quantity;
    }

    void display() {
        System.out.println(medicineName + " - Quantity: " + quantity);
    }
}

class Inventory {
    private MedicineStock[] stocks;

    Inventory() {
        stocks = new MedicineStock[] {
            new MedicineStock("Paracetamol", 50),
            new MedicineStock("Cetirizine", 30),
            new MedicineStock("Antacid", 20)
        };
    }

    void displayInventory() {
        for (MedicineStock stock : stocks) {
            stock.display();
        }
    }
}

public class Q04_PharmacyInventory {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        inventory.displayInventory();
    }
}
