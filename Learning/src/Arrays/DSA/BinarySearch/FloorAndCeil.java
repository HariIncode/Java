package Arrays.DSA.BinarySearch;

public class FloorAndCeil {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 7;

        System.out.println("Ceil of the number: " + ceil(nums, target));
        System.out.println("floor of the number: " + floor(nums, target));
    }

    static int ceil(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        if(target < arr[0]) return -1;

        while(start <= end){
            //int mid = (start+end)/2; // there is a chance that (start+end) may become a large value, so instead use (start + (end - start))
            int mid = start + (end - start)/2;

            if (arr[mid] == target){
                return arr[mid];
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return start;
    }

    static int floor(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            //int mid = (start+end)/2; // there is a chance that (start+end) may become a large value, so instead use (start + (end - start))
            int mid = start + (end - start)/2;

            if (arr[mid] == target){
                return arr[mid];
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return arr[end];
    }
}
