package Task_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        Loop Task 1

        for (int i = 1000; i <= 10000; i = i + 3 ) {
            System.out.println(i);
        }

//        Task 2

//        int [] array = {10, 6, 2,-2,-6,-10};
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] > 0) {
//                System.out.println("Положительные элементы последовательности: " + array[i]);
//            }
//        }

//        Task 3

//        int number;
//        long factorial = 1;
//
//        System.out.println("Введите число от 1 до 20");
//        if (scanner.hasNextInt()) {
//            number = scanner.nextInt();
//            if (number>0 && number<21) {
//                System.out.println("Ваше число: " + number);
//                System.out.println();
//                for (int i = 1; i <= number; i++) {
//                    factorial = factorial * i;
//                }
//            } else {
//                System.out.println("Ошибка! Введено число вне диапазона. Перезапустите программу.");
//            }
//
//            if (factorial == 1) {
//                System.out.println("!1 = 1");
//            } else {
//                System.out.println("!" + number + " = " + factorial);
//            }
//        } else {
//            System.out.println("Ошибка! Введены некорректные данные. Перезапустите программу.");
//        }



//        Task 4

//        int num;
//        int sumNum = 0;
//
//        System.out.println("Enter any natural number");
//        if (scanner.hasNextInt()) {
//            num = scanner.nextInt();
//            if (num > 0) {
//                System.out.println("Your number is: " + num);
//                System.out.println();
//                while (num != 0) {
//                    sumNum += num % 10;
//                    num /= 10;
//                }
//            } else  {
//                System.out.println("Error! You entered incorrect data. Restart the program.");
//            }
//            System.out.println("The sum of numbers: " + sumNum);
//        } else {
//            System.out.println("Error! You entered incorrect data. Restart the program.");
//        }


//         Array
//         Task 1

//        int x = 21;
//        int [] array = new int[x];
//        for (int i = 2; i < array.length; i += 2) {
//            i += array[i];
//            System.out.print(i + " ");
//        }
//        System.out.println();
//        for (int i = 2; i < array.length; i += 2) {
//            i += array[i];
//            System.out.println(i + " ");
//        }

//
//       Task 2
//
//        int x = 100;
//        int [] array = new int[x];
//        for (int i = 1; i < array.length; i += 2) {
//            i += array[i];
//            System.out.print(i + " ");
//        }
//        System.out.println();
//
//        for (int i = array.length - 1 ; i >= 0 ; i -= 2) {
//            i -= array[i];
//            System.out.print(i + " ");
//        }


    }
}
