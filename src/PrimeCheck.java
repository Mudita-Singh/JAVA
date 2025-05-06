import java.util.ArrayList;
public class PrimeCheck {
    public static boolean isprime( int num ){
        if(num <= 1){
            return false;
        }
        for( int i = 2 ; i <= Math.sqrt(num); i++){
            if( num%i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main ( String[] args){
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(2);
        numbers.add(4);
        numbers.add(6);
        for( int i = 0; i < numbers.size(); i++){
            int value = ( Integer)numbers.get(i);
            boolean prime = isprime(value);
            System.out.println(value + "is"+ ( prime ? "is prime" : "not prime"));
        }

    }
}
