package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        int[] arr2 = {1,2,3,4,5}; // Another type of declaration
//        int[] arr1; //Declaration
//        arr1 = arr2;
//        System.out.println(Arrays.toString(arr2)); // Printing an array
//        arr1[0] = 44;
//        System.out.println(Arrays.toString(arr2));
        int[][] twoD = new int[3][3];
        System.out.print("Enter the Array");
        for(int row = 0; row < twoD.length; row++ ){
            for(int col = 0; col < twoD[row].length; col++ ){
                twoD[row][col] = sc.nextInt();
            }
        }
        for(int[] a : twoD){
            System.out.println(Arrays.toString(a));
        }

    }
}
