//lab3 ques-6
public class second_largest_element {
        public static void main(String[] args) {
            int[] arr = {10, 20, 4, 45, 99, 36, 99, 50};
            int largest = 0;
            int secondLargest = 0;

            for (int i= 0 ; i <arr.length ; i++)
            {
                if ( arr[i] > largest) {
                    secondLargest = largest;
                    largest = arr[i];
                } else if ( arr[i] > secondLargest && arr[i] != largest) {
                    secondLargest = arr[i];
                }
            }

            System.out.println("Second largest element: " + secondLargest);
        }
    }


