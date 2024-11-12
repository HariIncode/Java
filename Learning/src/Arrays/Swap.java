package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the Array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];


        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the first index to be Swapped :");
        int ind1 = sc.nextInt();

        System.out.print("Enter the Second index to be Swapped :");
        int ind2 = sc.nextInt();

        System.out.println("Array Before Swapping: "+Arrays.toString(arr));

        swap(arr, ind1, ind2);

        System.out.println("Array After Swapping: "+Arrays.toString(arr));

    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
