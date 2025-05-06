//lab3 ques-7
public class pattern {
    public static void main(String[] args) {
        int[] pattern = {1, 3, 5, 7, 9};

        for (int i = 0; i < pattern.length; i++) {
            char symbol;
            if (i % 2 == 0) {
                symbol = '?';
            } else
            {
                symbol = '#';
            }

            for (int j = 0; j < pattern[i]; j++) {
                System.out.print(symbol);
            }

            System.out.println();
        }
    }
}


