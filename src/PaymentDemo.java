abstract class Payment {
    abstract void makePayment(double amount);
}

class CreditCardPayment extends Payment {
    void makePayment(double amount) {
        System.out.println("Paid rupee " + amount + " using Credit Card.");
    }
}

class PayPalPayment extends Payment {
    void makePayment(double amount) {
        System.out.println("Paid rupee " + amount + " using PayPal.");
    }
}

public class PaymentDemo {
    public static void main(String[] args) {
        Payment p1 = new CreditCardPayment();
        p1.makePayment(500);

        Payment p2 = new PayPalPayment();
        p2.makePayment(1200);
    }
}
