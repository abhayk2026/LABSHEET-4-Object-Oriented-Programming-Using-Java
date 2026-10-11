class PatientBill {
    private double consultationFee;
    private double medicineFee;
    private double testFee;

    void setConsultationFee(double fee) {
        if (fee >= 0) consultationFee = fee;
    }

    void setMedicineFee(double fee) {
        if (fee >= 0) medicineFee = fee;
    }

    void setTestFee(double fee) {
        if (fee >= 0) testFee = fee;
    }

    double calculateTotal() {
        return consultationFee + medicineFee + testFee;
    }

    void displayBill() {
        System.out.printf("Consultation Fee: Rs. %.2f%n", consultationFee);
        System.out.printf("Medicine Fee: Rs. %.2f%n", medicineFee);
        System.out.printf("Test Fee: Rs. %.2f%n", testFee);
        System.out.printf("Total Bill: Rs. %.2f%n", calculateTotal());
    }
}

public class Q08_PatientBill {
    public static void main(String[] args) {
        PatientBill bill = new PatientBill();
        bill.setConsultationFee(300);
        bill.setMedicineFee(450);
        bill.setTestFee(250);
        bill.displayBill();
    }
}
