package Sorting;

import java.util.Arrays;

import static Arrays.Basics.Swap.swap;

// Best to sort or find missing in range 1 to N
public class Cyclic {
    public static void main(String[] args) {
        int[] arr = {6, 5, 4, 3, 2, 1};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclicSort(int[] arr){
        int i = 0;
        while( i < arr.length ){
            int correctIndex = arr[i] - 1;

            if(arr[i] != arr[correctIndex]){
                swap(arr, i, correctIndex);
            }else{
                i++;
            }
        }
    }
}
