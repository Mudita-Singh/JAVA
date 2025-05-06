
class MathConstants {

    final double PI = 3.14;

    final void displayPI() {
        System.out.println("Value of PI: " + PI);
    }
}


class Circlee extends MathConstants {

    void calculateArea(double radius) {
        double area = PI * radius * radius;
        System.out.println("Area of circle: " + area);
    }

    //void displayPI() {
    // System.out.println("Overriding final method.");   // Cannot override final method
}


public class Imp {
    public static void main(String[] args) {
        Circlee c = new Circlee();
        c.displayPI();
        c.calculateArea(5);  // Calculate area for radius = 5


    }
}
