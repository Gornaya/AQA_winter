package Task_2;

public class Main {
    public static void main(String[] args) {

//      Задача 1

        double a = 10/2.54;
        System.out.println(a + " inch");
        float b = 25*2.54F;
        System.out.println(b + " cm");

//        Задача 2

        int vas = 5000;
        int par = 5000;
        float c = 28.0F;
        float ex = (vas + par) / c;
        System.out.println(ex + " euro");

//        Задача 3

        int ch = 69;
        int des = ch / 10;
        int ed = ch % 10;
        System.out.println(ed + " " + des);

//        Задача 4

        int ch2 = 78;
        int des2 = (ch2 / 10)*10;
        int ed2 = ch2 % 10;
        System.out.println(des2 + "+" + ed2);

//        Задача 5

        int ch3 = 26;
        int des3 = ch3 / 10;
        int ed3 = ch3 % 10;
        System.out.println(des3+ed3);

//        Задача 7

        int x = 0;
        if (x > 0) {
            System.out.println("Число положительное");
        } else if (x < 0) {
            System.out.println("Число отрицательное");
        } else {
            System.out.println("Число равно нулю");
        }
//       Задача 8

        int y = 256;
        if (y > 99 && y < 1000) {
            System.out.println(--y);
        }
//      Задача 9

        int d = 100;
        int d_des = d / 10;
        int d_ed = d % 10;
        int p = d_des * d_ed;
        System.out.println( "Наше число " + d);
        System.out.println( "Произведение чисел " + p);

        if (d > 10 && d < 100) {
            if (d > p) {
                System.out.println("Число больше произведения его цифр");
            } else {
                System.out.println("Число меньше произведения его цифр");
            }
        } else {
            System.out.println("Ваше число не двузначное или отрицательное");
        }

    }
}
