package String.Basics;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String s = "Hari Haran";
        System.out.println(Arrays.toString(s.toCharArray()));
        System.out.println(s.length());
        System.out.println(Arrays.toString(s.getBytes()));
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());

    }
}
