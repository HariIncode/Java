package TCS.Practice;

import static Arrays.Basics.Swap.swap;

public class Chocolate {
    public static void main(String[] args) {
        int[] arr = {4,5,0,1,9,0,5,0};

        int n = arr.length;
        int count = n - 1;

        for (int i = 0; i < n; i++) {
            if(arr[i] != 0){
                swap(arr, i, count++);
            }
        }
    }
}
