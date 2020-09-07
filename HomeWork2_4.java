package homework2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWork2_4 {
    //  Выполнить сортировку массива с числами:
//      4.0. !!!!ВНИМАНИЕ!!!! код сортировок в данном ДЗ не должен дублироваться. Дублирование кода сортировок
//      приведёт к провалу выполнения данного задания. Итогом выполнения данного задания будет МАКСИМУМ 2 класса,
//      может быть 1.
//      4.1. После каждой сортировки в консоли у вас должно получиться
//      "[Какой массив был до сортировки] -> [Каким стал массив после сортировки]". Для вывода можно использовать Arrays.
//	4.2. Пишем следующие алгоритмы:
//      4.2.1. Пузырьковая сортировка
//		4.2.2. Шейкерная сортировка
//	4.3. Для тестов используем предварительно созданные массивы (в коде ваши тесты должны остаться):
//      4.3.1. {1,2,3,4,5,6}
//		4.3.2. {1,1,1,1}
//		4.3.3. {9,1,5,99,9,9}
//		4.3.4. {}
//	4.4. После тестов написать код который будет создавать массив рандомной длинны, заполнять массив рандомными числами
//	4.5. После рандома написать код который будет создавать массив руками через консоль
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 3, 4, 5, 6};
        int[] arr2 = new int[]{1, 1, 1, 1};
        int[] arr3 = new int[]{9, 1, 5, 99, 9, 9};
        int[] arr4 = new int[]{};

        System.out.println("------пузырьковая------");
        printNativAndSort(arr1);
        printNativAndSort(arr2);
        printNativAndSort(arr3);
        printNativAndSort(arr4);

        System.out.println();
        System.out.println("------шейкерная------");
        printNativAndShake(arr1);
        printNativAndShake(arr2);
        printNativAndShake(arr3);
        printNativAndShake(arr4);

        randomArrey();
        consolArrey();

    }

    private static void printNativAndSort(int[] arr1) {
        System.out.print(Arrays.toString(arr1) + " -> ");
        printSortBubble(arr1);
    }

    private static void printSortBubble(int[] arr) {
        for (int j = 0; j < arr.length; j++) {
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < arr[i - 1]) {
                    int memory = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = memory;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void printNativAndShake(int[] arr1) {
        System.out.print(Arrays.toString(arr1) + " -> ");
        printSortShake(arr1);
    }

    private static void printSortShake(int[] arr) {
        int changeBorder = 0;
        int changeBackBorder = 0;
        int changeFrontBorder = 0;
        int temp = 0;

        while (arr.length - changeBorder > 1) {
            for (int i = 1 + changeFrontBorder; i < arr.length - changeBackBorder; i++) {
                if (arr[i - 1] > arr[i]) {
                    int memory = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = memory;
                }
                temp = i;
            }
            changeBackBorder = arr.length - temp;

            for (int i = arr.length - changeBackBorder; i > changeFrontBorder; i--) {
                if (arr[i - 1] > arr[i]) {
                    int memory = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = memory;
                }
                temp = i;
            }
            changeFrontBorder = temp;
            changeBorder = changeBackBorder + changeFrontBorder;
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void consolArrey() {
        System.out.println();
        System.out.println("Введите размер массива:");
        int[] arrConsol = new int[new Scanner(System.in).nextInt()];
        System.out.println("Заполните массив:");
        for (int i = 0; i < arrConsol.length; i++) {
            arrConsol[i] = new Scanner(System.in).nextInt();
        }
        System.out.println(Arrays.toString(arrConsol));
    }

    private static void randomArrey() {
        System.out.println();
        System.out.println("рандомный массив");
        int[] arrRandom = new int[new Random().nextInt(20)];
        for (int i = 0; i < arrRandom.length; i++) {
            arrRandom[i] = new Random().nextInt(2000);
        }
        System.out.println(Arrays.toString(arrRandom));
    }

}
