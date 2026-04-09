package Patterns;

public class Numbers {
    public static void main(String[] args) {
        int count = 5;

        pattern30(count);
    }

    public static void pattern1(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    public static void pattern30(int n){
        for (int row = 1; row <= n; row++) {

            int spaces = n - row;

            for (int s = 1; s <= spaces; s++) {
                System.out.print("  ");
            }

            for (int col = row; col >= 1; col--) {
                System.out.print(col + " ");
            }

            for (int col = 2; col <= row; col++) {
                System.out.print(col + " ");
            }

            System.out.println();
        }
    }
}
