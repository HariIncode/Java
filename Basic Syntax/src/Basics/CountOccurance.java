package Learning.Basics;

import java.util.Scanner;

public class CountOccurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, m, rem, count = 0;

        System.out.print("Enter the number: ");
        n = sc.nextInt();
        System.out.print("Enter the number to be counted: ");
        m = sc.nextInt();

        while(n>0){
            rem = n%10;
            if(rem == m){
                count++;
            }
            n /=10;
        }
        System.out.println("The total number of occurrence of "+ m +" is "+ count);

    }
}
