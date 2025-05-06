import java.util.ArrayList;

class Employy {
    String name;
    int id;
    double salary;

    Employy(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void printDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
    }
}
class EmployeeManager {
    public static void main(String[] args) {
        ArrayList<Employy> employees = new ArrayList<>();

        employees.add(new Employy("Aman", 101, 50000));
        employees.add(new Employy("Divyansh", 102, 55000));
        employees.add(new Employy("Varchasv", 103, 60000));

        // Update salary of employee with id 102
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).id == 102) {
                employees.get(i).salary = 58000;
                break;
            }
        }

        // Remove employee with id 101
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).id == 101) {
                employees.remove(i);
                break;
            }
        }

        // Print remaining employees using basic for loop
        System.out.println("Remaining Employees:");
        for (int i = 0; i < employees.size(); i++) {
            employees.get(i).printDetails();
        }
    }
}
