public class Find {
        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 5 ,6};
            int value = 12;
            boolean isPresent = false;
            for (int i = 0; i < arr.length; i++)
            {
                if (arr[i] == value) {
                    isPresent = true;
                    break;
                }
            }

            if (isPresent) {
                System.out.println( value + " is present" );
            } else {
                System.out.println( value + " is not present" );
            }
        }

    }

