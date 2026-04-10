package Patterns;

public class Star {
    public static void main(String[] args) {

        int n = 5;

        triangle(n);
    }

//    Pattern 1
    public static void square(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 0; col <= n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

//    Pattern 2
    public static void rightAngle(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

//    Pattern 3
    public static void inverseRightAngle(int n){
        for (int row = n; row >= 1; row--) {
            for (int col = row; col >= 1 ; col--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

//    Pattern 3
    public static void inverseRightAngleMethod2(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n + 1 - row ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

//    Pattern 5
    public static void arrow(int n){
        for (int row = 1; row <= 2*n - 1; row++) {
            int c = row <= n ? row : 2*n - row;

//            if( row <= n) c = row; else c = 2*n - row ;

            for (int col = 1; col <= c; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

//    Pattern 6
    public static void mirrorRightAngle(int n){
        for (int row = 1; row <= n; row++) {

            int spaces = n - row;
            for (int s = 0; s < spaces; s++) {
                System.out.print(" ");
            }

            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //    Pattern 7
    public static void inverseMirrorRightAngle(int n){
        for (int row = 1; row <= n; row++) {

            int spaces = row - 1;
            for (int s = 0; s < spaces; s++) {
                System.out.print(" ");
            }

            for (int col = 1; col <= n + 1 - row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

//    Pattern 8
    public static void triangle(int n){
        for (int row = 1; row <= n; row++) {

            int spaces = n - row;
            for (int s = 0; s < spaces; s++) {
                System.out.print("  ");
            }

            for (int col = 1; col <= 2 * row - 1; col++) {
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


