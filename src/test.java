class Test {
    Test(double d) {
        this(10);
        System.out.println("Double argument");
    }

    Test(int x) {
        this();
        System.out.println("Integer argument");
    }

    Test() {
        System.out.println("No argument");
    }

    public static void main(String[] args) {
        Test T1 = new Test(10.5);
    }
}
