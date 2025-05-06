//lab3 ques-5
public class array_count {
        public static void main(String[] args) {
            int[] arr = {2, 4, 6, 2, 8, 2, 4, 6, 2, 10};
            int target = 2;
            int count = 0;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == target) {
                    count++;
                }
            }

            System.out.println("occurrences of " + target + " are " + count);
        }
    }


