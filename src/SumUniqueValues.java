import java.util.ArrayList;
import java.util.HashSet;

public class SumUniqueValues {
    public static void main(String[] args) {
        // arrayList with duplicate integers
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(5);
        numbers.add(3);
        numbers.add(8);
        numbers.add(2);
        numbers.add(5);

        //  ArrayList into HashSet to remove duplicates
        HashSet<Integer> uniqueNumbers = new HashSet<>(numbers);

        // Calculate the sum of unique values
        int sum = 0;
        for (int num : uniqueNumbers) {
            sum = sum + num;
        }

        // Print the sum
        System.out.println("Sum of unique values: " + sum);
    }
}
