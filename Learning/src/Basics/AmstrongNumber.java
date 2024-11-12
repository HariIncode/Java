package Learning.Basics;

import java.util.Scanner;

public class AmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to be checked: ");
        int n = sc.nextInt();
        boolean res = isArmstrong(n);

        for (int i = 100; i < 1000; i++){
            if (isArmstrong(i)){
                System.out.println(i);
            }
        }
    }

    static boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;

        while(n>0){
            int rem = n % 10;
            n /= 10;
            sum += (int) Math.pow(rem,3);
        }

        return original == sum;
    }
}
