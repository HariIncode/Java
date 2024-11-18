package Arrays.DSA.LinearSearch;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);

//        int[][] arr = new int[3][3];

//        for (int row = 0; row < arr.length; row++) {
//            for (int col = 0; col < arr[row].length; col++) {
//                arr[row][col] = sc.nextInt();
//            }
//        }

        int[][] arr = {
                {23, 4, 1},
                {18, 12, 3, 9},
                {78, 99, 34, 56},
                {18, 12}
        };
        int target = 34;
        System.out.println(Arrays.toString(search(arr, target)));
        System.out.println("Minimum value in the array: " + min(arr));
        System.out.println("Maximum value in the array: " + max(arr));
    }

    static int[] search(int[][] arr, int target){

        if (arr == null || arr.length == 0) return new int[] {-1, -1};

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] == target) return new int[] {row,col};
            }

        }
        return new int[] {-1, -1};
    }

    static int min(int[][] arr){
        int minVal = Integer.MAX_VALUE;
        for (int[] nums: arr ){
            for(int num: nums){
                if(minVal > num) minVal = num;
            }
        }
        return minVal;
    }
    static int max(int[][] arr){
        int maxVal = Integer.MIN_VALUE;
        for (int[] nums: arr ){
            for(int num: nums){
                if(maxVal < num) maxVal = num;
            }
        }
        return maxVal;
    }
}
