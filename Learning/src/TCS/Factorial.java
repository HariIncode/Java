package TCS;

public class Factorial {
    public static void main(String[] args) {
        int n = 21;
        System.out.println(fact(n));
    }

    static long fact(int n){
        if(n <= 0) return 1;

        long f = 1;

        for(int i = 1; i <= n; i++){
            f *= i;
        }

        return f;
    }
}
