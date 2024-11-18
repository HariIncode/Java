package Arrays.DSA.LinearSearch;

public class EvenDigitNumbers {
    public static void main(String[] args) {
        int[] nums = {123, 22, 234, 332};
        System.out.println("The number of even digits are: " + solution(nums));
    }

    static int solution(int[] nums) {
        int count = 0;
        for(int num: nums){
            if(even(num)) count++;
        }
        return count;
    }

    static boolean even(int num) {
        int res = digits(num);
        return res % 2 == 0;
    }

    static int digits(int num){
        int count = 0;
        while(num > 0){
            count++;
            num /=  10;
        }
        return count;
    }
}
