package Learning.Basics;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        // Take input from user until the user enters X or x
        Scanner sc = new Scanner(System.in);

        while(true){
            // Take the operator as input
            System.out.print("Enter the Operation : ");
            char op = sc.next().trim().charAt(0);
            int res = 0;

            if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
                System.out.print("Enter First Number : ");
                int num1 = sc.nextInt();
                System.out.print("Enter Second Number : ");
                int num2 = sc.nextInt();

                switch (op) {
                    case '+' -> res = num1 + num2;
                    case '-' -> res = num1 - num2;
                    case '*' -> res = num1 * num2;
                    case '/' -> {
                        if (num2 == 0) {
                            System.out.println("Cannot divide by Zero");
                        } else {
                            res = num1 / num2;
                        }
                    }
                    case '%' -> {
                        if (num2 == 0) {
                            System.out.println("Cannot divide by Zero");
                        } else {
                            res = num1 % num2;
                        }
                    }
                    default -> System.out.println("Try Again!!!");
                }
            } else if (op == 'x' || op == 'X') {
                break;
            } else{
                System.out.println("Invalid operation");
            }
            System.out.println("Result : "+res);
        }
    }
}
