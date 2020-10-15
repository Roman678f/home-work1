package homework.homeworkStroki;

import java.util.Scanner;

public class StringClass {

    //не понял как сделать именно метод String toString(int number), получился просто void string()

    static int a =-256987300;
    static String result = "";

    public static void main(String[] args) {

        if (a == 0) {
            System.out.println("ноль");
        }
        if (a < 0) {
            System.out.print("минус ");
        }
        a = Math.abs(a);
        string();


    }

    public static void string() {
        int tmp = a;
        if (a < 1000) {
            string1_999();
        }
        if (a >= 1000 && a < 999999) {
            a = a / 1000;
            string1_999();
            printThousand();
            a = tmp % 1000;
            string1_999();

        }
        if (a >= 1000000) {
            a = tmp / 1000000;
            string1_999();
            printMillion();
            a = tmp / 1000 % 1000;
            string1_999();
            printThousand();
            a = tmp % 1000;
            string1_999();
        }
    }

    public static void string1_99() {
        int tmp1;
        if (a < 10) {
            range1_9();
        }
        if (a > 9 && a < 20) {
            range10_19();
        }
        if (a % 10 == 0 && a < 100) {
            range20_90();
        }
        if (a > 19 && !(a % 10 == 0)) {
            tmp1 = a;
            a = a - a % 10;
            range20_90();
            a = tmp1 % 10;
            range1_9();
            a = tmp1;
        }

    }

    public static void string1_999() {
        int tmp2 = a;
        if (a % 100 == 0) range100_900();
        else {
            a = a - a % 100;
            range100_900();
            a = tmp2 % 100;
            string1_99();
            a = tmp2;
        }
    }

    public static void printThousand() {
        if (a % 10 == 1) {
            System.out.print("тысяча ");
        }
        if ((a % 10 == 2 || a % 10 == 3 || a % 10 == 4) && !(a % 100 > 10 && a % 100 < 20)) {
            System.out.print("тысячи ");
        }
        if (a == 0) {
            System.out.print("");
        } else if (a % 10 == 0 || a % 10 > 4 || (a % 100 > 10 && a % 100 < 20)) {
            System.out.print("тысяч ");
        }


    }

    public static void printMillion() {
        if (a % 10 == 1) {
            System.out.print("миллион ");
        }
        if ((a % 10 == 2 || a % 10 == 3 || a % 10 == 4) && !(a % 100 > 10 && a % 100 < 20)) {
            System.out.print("миллиона ");
        }
        if (a % 10 == 0 || a % 10 > 4 || (a % 100 > 10 && a % 100 < 20)) {
            System.out.print("миллионов ");
        }
    }

    public static void range1_9() {
        switch (a) {
            case 1:
                result = "один ";
                break;
            case 2:
                result = "два ";
                break;
            case 3:
                result = "три ";
                break;
            case 4:
                result = "четыре ";
                break;
            case 5:
                result = "пять ";
                break;
            case 6:
                result = "шесть ";
                break;
            case 7:
                result = "семь ";
                break;
            case 8:
                result = "восемь ";
                break;
            case 9:
                result = "девять ";
                break;
            default:
                result = "";
                break;
        }
        System.out.print(result);
    }

    public static void range10_19() {
        switch (a) {
            case 10:
                result = ("десять ");
                break;
            case 11:
                result = ("одинадцать ");
                break;
            case 12:
                result = ("двенадцать ");
                break;
            case 13:
                result = ("тринадцать ");
                break;
            case 14:
                result = ("четарнадцать ");
                break;
            case 15:
                result = ("пятнадцать ");
                break;
            case 16:
                result = ("шестнадцать ");
                break;
            case 17:
                result = ("семнадцать ");
                break;
            case 18:
                result = ("восемьнадцать ");
                break;
            case 19:
                result = ("девятнадцать ");
                break;
            default:
                result = "";
                break;
        }
        System.out.print(result);
    }

    public static void range20_90() {
        switch (a) {
            case 20:
                result = ("двадцать ");
                break;
            case 30:
                result = ("тридцать ");
                break;
            case 40:
                result = ("сорок ");
                break;
            case 50:
                result = ("пятьдесят ");
                break;
            case 60:
                result = ("шестьдесят ");
                break;
            case 70:
                result = ("семдесят ");
                break;
            case 80:
                result = ("восемьдесят ");
                break;
            case 90:
                result = ("девяносто ");
                break;
            default:
                result = "";
                break;
        }
        System.out.print(result);
    }

    public static void range100_900() {
        switch (a) {
            case 100:
                result = ("сто ");
                break;
            case 200:
                result = ("двести ");
                break;
            case 300:
                result = ("тристо ");
                break;
            case 400:
                result = ("четыресто ");
                break;
            case 500:
                result = ("пятьсот ");
                break;
            case 600:
                result = ("шестьсот ");
                break;
            case 700:
                result = ("семьсот ");
                break;
            case 800:
                result = ("восемьсот ");
                break;
            case 900:
                result = ("девятьсот ");
                break;
            default:
                result = "";
                break;
        }
        System.out.print(result);
    }



}
