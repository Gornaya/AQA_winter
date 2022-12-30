package Task_4;

import static Task_4.Method.getSum;

public class Main {
    public static void main(String[] args) {

        int num1 = Method.getInt();
        int num2 = Method.getInt();
        char action = Method.getOperation();
        int result = Method.calc(num1, num2, action);

        System.out.println(num1 + " " + action + " " + num2 + " = " + result);
    }
}