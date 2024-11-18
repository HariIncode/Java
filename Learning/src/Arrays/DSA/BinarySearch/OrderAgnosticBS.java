package Arrays.DSA.BinarySearch;

import java.util.Scanner;

import static Arrays.Basics.Basics.createArray;

public class OrderAgnosticBS {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = createArray();

        System.out.print("Enter the element to be searched: ");
        int target = sc.nextInt();

        System.out.println("The element is found at: " + orderAgnosticBS(arr, target));
    }

    static int orderAgnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        //find whether the array is ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while(start <= end){

            int mid = start + (end - start)/2;

            if (arr[mid] == target){
                return mid;
            }
            if (isAsc){
                if (arr[mid] > target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (arr[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
