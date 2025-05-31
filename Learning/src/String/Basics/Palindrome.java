package String.Basics;

import java.util.Arrays;

public class Palindrome {
    public static void main(String[] args) {
        String s = "madam";
        StringBuilder sb = new StringBuilder();
        sb.append(s.toLowerCase()).reverse();
        System.out.println(s.contentEquals(sb));

        boolean b = sb.compareTo(sb.reverse()) == 0;



        System.out.println(isPalindrome("Lee"));
        System.out.println(isPalindrome("Madam"));

        ex();
    }

    static boolean isPalindrome(String s){
        s = s.toLowerCase();
        int start = 0;
        int end = s.length() - 1;

        while( start <= end ){
            if(s.charAt(start) == s.charAt(end)) {
                start++;
                end--;
            }else{
                return false;
            }
        }
        return true;
    }

    static void ex(){
        String s = "is2 sentence4 This1 a3";

        String[] arr = s.split(" ");

        System.out.println(Arrays.toString(arr));
    }
}
