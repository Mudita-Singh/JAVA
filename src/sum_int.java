//lab3 ques-1
    public class sum_int{
        public static void main(String[] args) {
            int sum = 0;
            for (int i = 10; i <= 950; i++) {
                if (i % 6 == 0 && i % 9 == 0) {
                    sum = sum + i;
                }
            }
            System.out.println("Sum of numbers divisible by both 6 and 9: " + sum);
        }
    }

