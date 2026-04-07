package Sorting;

import java.util.Arrays;

import static Arrays.Basics.Swap.swap;

public class Selection {
    public static void main(String[] args) {
        int[] arr = {6, 5, 4, 3, 2, 1};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {

//          if i = 0 then n - 1 = arr of last
            int last = arr.length - i - 1;

//          to find max the first is always arr[0]
            int maxInd = findMaxInd(arr, 0, last);

            swap(arr, last, maxInd);
        }
    }

    static int findMaxInd(int[] arr, int first, int last) {
        int max = first;
        for(int i = first; i <= last; i++){
            if(arr[max] < arr[i])
                max = i;
        }
        return max;
    }
}
