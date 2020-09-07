package homework2;

import java.util.Scanner;

public class HomeWork2_1_3 {
    //    1.3. Возведение в степень. Через консоль пользователь вводит два числа. Первое число это число которое мы будем
//    возводить, Второе число это степень в которую возводят первое число. Степень - только положительная и целая.
//    Возводимое число - может быть отрицательным и дробным.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число:");
        double number = in.nextDouble();
        System.out.println("Введите степень:");
        double pow = in.nextDouble();

        if (pow < 0 || pow % 1 > 0) {
            System.out.println("Степень должна быть положительная и целая");
            return;
        }
        double result = 1;
        for (int i = 0; i < pow; i++) {
            result *= number;
        }
        System.out.println("Ответ: " + result);
    }
}