// Employee class
class Employeee {
    String name;
    int empid;
    double salary;

    // Default constructor
    public Employeee() {

    }

    // Parameterized constructor
    public Employeee(String name, int empid, double salary) {
        this.name = name;
        this.empid = empid;
        this.salary = salary;
    }

    // Method to increase salary by a percentage
    public void increaseSalary(double percentage) {
        salary = salary + salary * (percentage / 100);
    }

    // Method to display employee details
    public void display() {
        System.out.println("Employee ID: " + empid);
        System.out.println("Name: " + name);
        System.out.println("Salary: Rs. " + salary);
    }
}

// Manager subclass
class Managerr extends Employeee {
    String department;

    // Parameterized constructor
    public Managerr(String name, int empid, double salary, String department) {
        super(name, empid, salary);
        this.department = department;
    }

    // Overriding display method to show department
    public void display() {
        super.display();
        System.out.println("Department: " + department);
    }
}

// Test class
 class EmployeeTest {
    public static void main(String[] args) {
        // Creating Employee object
        Employeee emp = new Employeee("Rahul", 101, 50000);
        emp.display();

        // Increasing salary
        emp.increaseSalary(10);
        System.out.println("After Increment:");
        emp.display();

        // Creating Manager object
        Managerr mgr = new Managerr("Priya", 102, 70000, "IT");
        mgr.display();

        // Increasing salary for Manager
        mgr.increaseSalary(15);
        System.out.println("After Increment:");
        mgr.display();
    }
}
