package Q;
import P.A;

public class B extends A {
    public static void main(String[] args) {
        B obj = new B();

        obj.publicMethod();   // Accessible
        obj.protectedMethod(); // Accessible via inheritance (subclass)
        // obj.defaultMethod(); // Not accessible (different package)
        // obj.privateMethod(); //  Not accessible (private)

        System.out.println("Trying to access methods from Class A in a different package:");
    }
}
