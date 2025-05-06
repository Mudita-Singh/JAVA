import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter string");
        String str = scanner.nextLine();

        System.out.println("Enter indx:");
        int index = scanner.nextInt();


        char result = str.charAt(index);
        System.out.println( result);


        scanner.close();
    }
}
