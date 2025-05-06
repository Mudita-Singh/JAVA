public class index {
        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 5, 6};
            int value = 12;
            boolean isPresent = false;
            int index = -1; // Initialize index to -1 to indicate "not found"

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == value) {
                    isPresent = true;
                    index = i; // Store the index where the value is found
                    break; // Exit the loop once the value is found
                }
            }

            if (isPresent) {
                System.out.println(value + " is present at index " + index);
            } else {
                System.out.println(value + " is not present");
            }
        }
    }


