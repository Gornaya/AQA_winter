package Task_4;

import java.util.Scanner;

public class Method {

    static Scanner scanner = new Scanner(System.in);

    public static int getInt() {
        int num;
        System.out.println("Enter any number: ");
        if (scanner.hasNextInt()) {
            num = scanner.nextInt();
        } else {
            System.out.println("Error! Try again!");
            scanner.next();
            num = getInt();
        }
        return num;
    }

    public static char getOperation() {
        char ch;
        System.out.println("Enter one of the following signs +, -, *, /: ");
        if (scanner.hasNext()) {
            ch = scanner.next().charAt(0);
        } else {
            System.out.println("Error! Try again!");
            scanner.next();
            ch = getOperation();
        }
        return ch;
    }

    public static int getSum (int x, int y ) {
        return x + y;
    }

    public static int getDif (int x, int y) {
        return x - y;
    }

    public static int multiply (int x, int y){
        return x * y;
    }
    public static int divide (int x, int y){
        return x / y;
    }

    public static int calc (int num1, int num2, char operator) {
        switch (operator) {
            case '+':
                return Method.getSum(num1, num2);
            case '-':
                return Method.getDif(num1, num2);
            case '*':
                return Method.multiply(num1, num2);
            case '/':
                return Method.divide(num1, num2);
            default:
                return 0;
        }
    }
}
