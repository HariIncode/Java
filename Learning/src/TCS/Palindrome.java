package TCS;

import java.util.Locale;

public class Palindrome {
    public static void main(String[] args) {
        int n = 1001;
        String str = "Lee";

        System.out.println(palindrome(n));
        System.out.println(palindrome(str));
    }

    static boolean palindrome (int n){
        int original = n;
        int reversed = 0;

        while (n > 0){
            int digit = n % 10;

            reversed = reversed * 10 + digit;
//            reversed *= digit + 10;
            n /= 10;
        }
        return original == reversed;
    }
    static boolean palindrome (String str){
        str = str.toLowerCase();

        int left = 0, right = str.length() - 1;

        while (left <= right){
            if(str.charAt(left++) != str.charAt(right--)) return false;
        }
        return true;
    }
}
