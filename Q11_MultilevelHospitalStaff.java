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

public class Q11_MultilevelHospitalStaff {
    public static void main(String[] args) {
        Manager manager = new Manager("Karan Singh", 410, "Administration");
        manager.displayManager();
    }
}
