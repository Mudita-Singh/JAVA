import java.util.ArrayList;

public class PrimeChecker {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();


        for (int i = 2; i <= 20; i++) {
            numbers.add(i);
        }

        for (Integer num : numbers) {
            int unboxed = num;

            if (isPrime(unboxed)) {
                System.out.println(unboxed + " is a prime number.");
            } else {
                System.out.println(unboxed + " is not a prime number.");
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
