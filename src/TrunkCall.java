import java.util.Scanner;
abstract class TrunkCall {
    protected double duration;

    public TrunkCall(double duration) {
        this.duration = duration;
    }

    // Abstract method
    abstract double calculateCharge();
}

// subclass
class OrdinaryCall extends TrunkCall {
    public OrdinaryCall(double duration) {
        super(duration);
    }


    double calculateCharge() {
        return duration * 2; // Rs. 2 per minute
    }
}

//  subclass
class UrgentCall extends TrunkCall {
    public UrgentCall(double duration) {
        super(duration);
    }


    double calculateCharge() {
        return duration * 3;
    }
}

// Lightning call subclass
class LightningCall extends TrunkCall {
    public LightningCall(double duration) {
        super(duration);
    }

    @Override
    double calculateCharge() {
        return duration * 5; // Rs. 5 per minute
    }
}

// Main class
class TrunkCallCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter call duration ");
        double duration = scanner.nextDouble();
        System.out.print("Enter call type  ");
        String callType = scanner.next();
        TrunkCall call = null;


        if (callType.equals("ordinary")) {
            call = new OrdinaryCall(duration);
        } else if (callType.equals("urgent")) {
          call = new UrgentCall(duration);
        } else if (callType.equals("lightning")) {
             call = new LightningCall(duration);
        } else {
            System.out.println("Invalid call type entered!");
            scanner.close();
            return;
        }

        // Displaying the charge
        System.out.println("Total Charge: Rs. " + call.calculateCharge());
        scanner.close();
    }
}
