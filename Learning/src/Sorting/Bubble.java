package Sorting;

import java.util.Arrays;

import static Arrays.Basics.Swap.swap;

public class Bubble {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr) {
        boolean swapped;

//      Traverse from index 1 so that index 0 can be checked
        for (int i = 1; i < arr.length; i++) {
            swapped = false;

//          for each pass n - i is un sorted so just traverse that
            for (int j = 1; j < arr.length - i; j++) {
                if(arr[j] < arr[j-1]) {
                    swap(arr, j - 1, j);
                    swapped = true;
                }
            }

//          if no element is swapped the array is sorted
            if(!swapped)
                break;
        }
    }
}
