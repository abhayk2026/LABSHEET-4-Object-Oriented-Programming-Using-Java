class Student {
    private String name;
    private int rollNumber;

    Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
    }
}

public class Q01_StudentRecord {
    public static void main(String[] args) {
        Student student = new Student("Rahul Sharma", 101);
        student.display();
    }
}
