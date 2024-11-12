package Learning.Basics;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {

        echo(2);
        echo('H');

//        func(1,2,3,4,5,6,7,8,9,0);
    }

    static void echo(int a){
        System.out.println(a);
    }
    static void echo(char ch){
        System.out.println(ch);
    }
    static void func(int ...v) {
        System.out.println(Arrays.toString(v));
    }
}
