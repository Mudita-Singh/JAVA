// Abstract  class
abstract class Worker {
    protected String name;
    protected double salaryRate;

    // Constructor
    public Worker(String name, double salaryRate) {
        this.name = name;
        this.salaryRate = salaryRate;
    }

    // Abstract method
    abstract double computePay(int hours);
}

// Subclass for dailyworkers
class DailyWorker extends Worker {
    public DailyWorker(String name, double salaryRate) {
        super(name, salaryRate); // Calls the parent class constructor
    }

    @Override
    double computePay(int hours) {
        return (hours / 8) * salaryRate;
    }
}

// Subclass
class SalariedWorker extends Worker {
    public SalariedWorker(String name, double salaryRate) {
        super(name, salaryRate); // Calls the parent class constructor
    }

    @Override
    double computePay(int hours) {
        return 40 * salaryRate;
    }
}

// Main class
public class WorkerTest {
    public static void main(String[] args) {
        // DailyWorker object
        Worker dailyWorker = new DailyWorker(" aman ", 100);

        // SalariedWorker object
        Worker salariedWorker = new SalariedWorker(" arjun",  200);

        System.out.println("Daily Worker's Pay: " + dailyWorker.computePay(56));
        System.out.println("Salaried Worker's Pay: " + salariedWorker.computePay(56));
    }
}
