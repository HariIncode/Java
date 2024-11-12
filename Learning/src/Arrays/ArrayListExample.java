package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {

        single();

        multi();

    }
    static void single(){
        ArrayList<Integer> arr = new ArrayList<>(10);

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            arr.add(sc.nextInt());
        }
        System.out.println(arr);

    }

    static void multi(){
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>(10);

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            arr.add(new ArrayList<>());
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr.get(i).add(sc.nextInt());
            }
        }
    }
}
