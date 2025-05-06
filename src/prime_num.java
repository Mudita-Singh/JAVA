//lab3 ques-4
public class prime_num {
        public static void main(String[] args) {
            int count = 0;
            System.out.println("Prime numbers between 1 and 1000:");

            for (int num = 2; num <= 1000; num++) {
                boolean isPrime = true;

                for (int i = 2; i * i <= num; i++) {
                    if (num % i == 0) {
                        isPrime = false;
                        break;
                    }
                }

                if (isPrime) {
                    System.out.print(num + " ");
                    count++;
                }
            }

            System.out.println("\nTotal prime numbers: " + count);
        }
    }

