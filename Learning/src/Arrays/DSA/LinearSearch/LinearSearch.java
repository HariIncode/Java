package Arrays.DSA.LinearSearch;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the choice 1)INT 2)String: ");
        int choice = sc.nextInt();
        sc.nextLine();

        switch (choice){
            case 1 -> {
                System.out.print("Enter the size of the array: ");
                int n = sc.nextInt();

                int[] nums = new int[n];
                System.out.print("Enter the elements of the array: ");
                for (int i = 0; i < n; i++) {
                    nums[i] = sc.nextInt();
                }

                System.out.print("Enter the number to be searched: ");
                int target = sc.nextInt();

                System.out.println("Is the element in the array ? " + isExist(nums, target));
                System.out.println("Index of the element: " + searchIndex(nums, target));
            }
            case 2 ->{
                System.out.print("Enter the String to be Checked: ");
                String str = sc.nextLine();

                System.out.print("Enter the char to be searched: ");
                char ch = sc.nextLine().charAt(0);

                System.out.println("Is the element present in the String: " + isExist(str,ch));
                System.out.println("Index of the element: " + searchIndex(str,ch));
            }
            default -> System.out.println("Enter a correct option: ");
        }
        sc.close();
    }

    // isExist in the array: return the index if item found otherwise return not found -1
    static int searchIndex(int[] arr, int target){

        if(arr.length == 0) return -1;

        //run a for loop
        for (int index = 0; index < arr.length; index++) {
            //check for the element at every index if it is == target
            int element = arr[index];
            if (element == target) return index;
        }

        return -1;
    }
    static int searchIndex(String str, char ch){

        if(str.isEmpty()) return -1;

        for(int index = 0; index < str.length(); index++){   //another method
            if( str.charAt(index) == ch) return index;
        }

        return -1;
    }

    // isExist in the array: return true if item found otherwise return false
    static boolean isExist(int[] arr, int target){

        if(arr.length == 0) return false;

        //run a for loop
        for (int element : arr) {
            //check for the element at every index if it is == target
            if (element == target) return true;
        }
        return false;
    }
    static boolean isExist(String str, char ch) {

        if(str.isEmpty()) return false;

//      if(str.length() == 0) return false;   //another method

        for(char c : str.toCharArray()) {
            if (c == ch) return true;
        }

        return false;
    }
}
