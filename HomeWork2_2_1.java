package homework2;

import java.util.Scanner;

public class HomeWork2_2_1 {
    //    Массивы:
//            2.1 Вывести все элементы в консоль. Элементы массива вводить через консоль.
//            Массив хранит в себе числа. Выводить при помощи:
//            2.1.1. do....while
//            2.1.2. while
//            2.1.3. for
//            2.1.4. foreach.
    public static void main(String[] args) {
        System.out.println("Ввод:");
        int[] arr = new int[2];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Scanner(System.in).nextInt();
        }

        System.out.println("---------do...while--------");
        int i = 0;
        do {
            System.out.println(arr[i]);
            i++;
        } while (i < arr.length);


        System.out.println("-------while-------");
        i = 0;
        while (i < arr.length) {
            System.out.println(arr[i]);
            i++;
        }


        System.out.println("-----for----- ");
        i = 0;
        for (; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


        System.out.println("-----foreach------");
        for (int j : arr) {
            System.out.println(j);

        }
    }
}
