package Patterns;

public class Star {
    public static void main(String[] args) {

        int n = 5;

        pattern28(n);
    }

    public static void square(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 0; col <= n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void rightAngle(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void inverseRightAngle(int n){
        for (int row = n; row >= 1; row--) {
            for (int col = row; col >= 1 ; col--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void inverseRightAngleMethod2(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n + 1 - row ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void arrow(int n){
        for (int row = 1; row <= 2*n - 1; row++) {
            int c = row <= n ? row : 2*n - row;


//            if( row <= n){
//                c = row;
//            }else{
//                c = 2*n - row ;
//            }

            for (int col = 1; col <= c; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern28(int n){
        for (int row = 1; row <= 2*n - 1; row++) {
            int c = row <= n ? row : 2*n - row;
            int spaces = n - c;

            for (int s = 0; s < spaces; s++) {
                System.out.print(" ");
            }

            for (int col = 1; col <= c; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}


