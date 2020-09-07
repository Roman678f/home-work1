package homework2;

import java.util.Scanner;

public class HomeWork2_2_2 {
    //	2.2 Вывести каждый второй элемент массива в консоль
    public static void main(String[] args) {
        System.out.println("Ввод:");
        int[] arr = new int[4];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Scanner(System.in).nextInt();
        }

        System.out.println("---------do...while--------");
        int i = 1;
        do {
            System.out.println(arr[i]);
            i += 2;
        } while (i < arr.length);


        System.out.println("-------while-------");
        i = 1;
        while (i < arr.length) {
            System.out.println(arr[i]);
            i += 2;
        }


        System.out.println("-----for----- ");
        i = 1;
        for (; i < arr.length; i += 2) {
            System.out.println(arr[i]);
        }


        System.out.println("-----foreach------");
        int count = 1;
        for (int j : arr) {
            if (count % 2 == 0) {
                System.out.println(j);
            }
            count++;
        }
    }
}




