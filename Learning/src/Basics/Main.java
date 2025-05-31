package Basics;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = "Hari";
        String n = "Hari";

        System.out.println(s.equals(n));
        System.out.println(s ==n );

        String str = new String("Hari");

        System.out.println(s.equals(str));
        System.out.println(s == "Hari" );
        System.out.println(str == "Hari" );
        System.out.println(s.equals("Hari"));
        System.out.println(str.equals("Hari"));


    }
}