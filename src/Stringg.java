public class Stringg {
    public static void main(String[] args) {
        String str = "abc";  // Invalid number format

        try {
            // Attempt to convert string to integer
            int number = Integer.parseInt(str);
            System.out.println("Converted Number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format. Cannot convert '" + str + "' to an integer.");
        }
    }
}
