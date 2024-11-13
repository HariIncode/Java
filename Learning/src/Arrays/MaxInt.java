package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaxInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the Array: ");
        int n = sc.nextInt();

        System.out.print("Enter the Array: ");
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("The Maximum num in the array is: "+maxNum(arr));

        System.out.print("Enter the Starting position: ");
        int start = sc.nextInt();

        System.out.print("Enter the Ending position: ");
        int end = sc.nextInt();

        System.out.println("The Maximum num in the array is: "+maxNumInRange( arr, start, end ));

        rev(arr);

        System.out.print("The reverse of the array is: "+ Arrays.toString(arr));

    }

    static void rev(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while(start < end){
            Swap.swap(arr,start,end);
            start++;
            end--;
        }
    }

    static int maxNum(int[] arr) {
        int maxVal = arr[0];
        for (int j : arr) {
            if (maxVal < j) {
                maxVal = j;
            }
        }
        return maxVal;
    }
    static int maxNumInRange(int[] arr,int start, int end) {
        int maxVal = arr[start];
        for (int i = start; i < end; i++) {
            if(maxVal < arr[i]){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
