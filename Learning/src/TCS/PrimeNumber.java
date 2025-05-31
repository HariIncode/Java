package TCS;

public class PrimeNumber {
    public static void main(String[] args) {
        int num = 11;

        System.out.println( isPrime(num) ? "It is a prime number" : "It is not a Prime number" );
    }

    public static boolean isPrime(int num){
        if(num <= 1) return false;
        if(num == 2) return true;
        if(num % 2 == 0) return false;

        for (int i = 2; i <Math.sqrt(num); i+=2) {
            if(num % i == 0) return false;
        }

        return true;
    }
}
