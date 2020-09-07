package homework2;

import java.util.Scanner;

public class HomeWork2_2_3 {
    //	2.3 Вывести все элементы массива в консоль в обратном порядке. Элементы массива вводить через консоль.
//   	Массив хранит в себе числа. Выводить при помощи:
//            2.3.1. do....while
//            2.3.2. while
//            2.3.3. for
//            2.3.4. foreach
    public static void main(String[] args) {
        System.out.println("Ввод:");
        int[] arr = new int[3];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Scanner(System.in).nextInt();
        }

        System.out.println("---------do...while--------");
        int i = arr.length - 1;
        do {
            System.out.println(arr[i]);
            i--;
        } while (i >= 0);


        System.out.println("-------while-------");
        i = arr.length - 1;
        while (i >= 0) {
            System.out.println(arr[i]);
            i--;
        }


        System.out.println("-----for----- ");
        i = arr.length - 1;
        for (; i >= 0; i--) {
            System.out.println(arr[i]);
        }


        System.out.println("-----foreach------");           // ?????
        for (int j : arr) {
            System.out.println(j);

        }
    }

}
