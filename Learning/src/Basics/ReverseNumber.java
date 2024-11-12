package Learning.Basics;

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
        System.out.println("The reverse of the number is : "+res);
    }
}
