class SuperClass {
    private int privateData = 42;

    public int getPrivateData() {
        return privateData;
    }
}

class DerivedClass extends SuperClass {
    public void showAccess() {
        System.out.println("access is restricted ");
        System.out.println("Access private data using get method " );
        System.out.println(" use getPrivateData() : " + getPrivateData());
    }
}

public class PrivateAccessDemo {
    public static void main(String[] args) {
        DerivedClass obj = new DerivedClass();
        obj.showAccess();
    }
}

