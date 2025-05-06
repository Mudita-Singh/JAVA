//lab3 ques-2
import java.util.Scanner;
public class sum_digits {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter an integer: ");
            int num = scanner.nextInt();
            int sum = 0;

            while (num != 0) {
                sum = sum + num % 10;
                num = num / 10;
            }

            System.out.println("Sum of digits: " + sum);
            scanner.close();
        }
    }

