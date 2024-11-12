package Learning.Basics;

import java.util.Scanner;

public class Days {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a day between 1 to 7: ");

        int day = sc.nextInt();

        switch (day){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Please Enter a Valid Day between 1 to 7");
        }

        System.out.print("Enter a Day to Check for Weekend or Weekday: ");
        String str = sc.nextLine();
        sc.close();

        switch (str){
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> System.out.println("Weekdays");
            case "Saturday", "Sunday" -> System.out.println("Weekends");
            default -> System.out.println("Please Enter a valid day EX: Monday");
        }
    }
}
