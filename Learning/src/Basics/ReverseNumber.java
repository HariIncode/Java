package Basics;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number to be Reversed : ");
        int n = sc.nextInt();
        int rem, res = 0;

        while(n>0){
            rem = n%10;

            res = res*10 + rem;

            n/=10;
        }
        long[] arr = {1,2,3,5,7,9};
        System.out.println(Arrays.toString(arr));

        System.out.println("The reverse of the number is : "+res);
    }
}
