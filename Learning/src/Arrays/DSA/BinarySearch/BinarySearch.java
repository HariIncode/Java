package Arrays.DSA.BinarySearch;

import java.util.Scanner;

import static Arrays.Basics.Basics.createArray;

public class BinarySearch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        int target = 3;
//        System.out.println(binarySearch(arr,target));

        int[] arr = createArray();
        System.out.print("Enter the element to be searched: ");
        int target = sc.nextInt();

        System.out.println("The element found at: " + binarySearch(arr, target));
    }

    // return the index
    // return -1 if it doesn't exist
    static int binarySearch(int[] arr, int target){

        int start = 0;
        int end = arr.length-1;

        while(start <= end){

            //int mid = (start+end)/2; // there is a chance that (start+end) may become a large value, so instead use (start + (end - start))
            int mid = start + (end - start)/2;

            if (arr[mid] == target){
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
