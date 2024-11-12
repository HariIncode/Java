package Learning.Basics;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int empId = sc.nextInt();
        sc.nextLine();
        String department = sc.nextLine();

        switch (empId){
            case 1:
                System.out.println("Hari haran");
                break;
            case 2:
                System.out.println("Lee");
                break;
            case 3:
                switch (department) {
                    case "IT" -> System.out.println("IT department");
                    case "Management" -> System.out.println("Management Department");
                    default -> System.out.println("No department");
                }
            default:
                System.out.println("Enter Correct Employee id");
        }
    }
}
