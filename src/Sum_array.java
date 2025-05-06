public class Sum_array{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 0 ;
        for (int i = 0; i <= 4; i = i+2)
        {
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }
}
