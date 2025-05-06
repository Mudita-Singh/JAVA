package P;

// Abstract class Employee with abstract methods
abstract class Employee {
    String name;
    String role;

    // Constructor
    Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }

    abstract void calculateSalary(); // Abstract method
    abstract void displayDetails();  // Abstract method
}

// Manager class extending Employee
class Manager extends Employee {
    private double fixedSalary;

    // Constructor
    Manager(String name, double fixedSalary) {
        super(name, "Manager");
        this.fixedSalary = fixedSalary;
    }

    // Implementing calculateSalary()
    void calculateSalary() {
        System.out.println("Manager's Salary: ₹" + fixedSalary);
    }

    // Implementing displayDetails()
    void displayDetails() {
        System.out.println("Name: " + name + ", Role: " + role + ", Salary: ₹" + fixedSalary);
    }
}

// Developer class extending Employee
class Developer extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    // Constructor
    Developer(String name, double hourlyRate, int hoursWorked) {
        super(name, "Developer");
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    // Implementing calculateSalary()
    void calculateSalary() {
        double salary = hourlyRate * hoursWorked;
        System.out.println("Developer's Salary: ₹" + salary);
    }

    // Implementing displayDetails()
    void displayDetails() {
        double salary = hourlyRate * hoursWorked;
        System.out.println("Name: " + name + ", Role: " + role + ", Salary: ₹" + salary);
    }
}

// Main class to test Employee functionality
public class EmployeeDemo {
    public static void main(String[] args) {
        Employee manager = new Manager("Rahul", 80000);  // Manager object
        Employee developer = new Developer("Priya", 500, 160);  // Developer object

        manager.displayDetails();
        manager.calculateSalary();

        System.out.println();

        developer.displayDetails();
        developer.calculateSalary();
    }
}
