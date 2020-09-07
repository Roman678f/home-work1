package homework2;

import java.util.Arrays;

public class HomeWork2_1_1 {
    //    1. Циклы:
//    1.1. Перемножить числа от 1 до числа (включительно) введенного через аргумент к исполняемой программе.
//    Пример: Ввели 5, должно получиться 1 * 2 * 3 * 4 * 5 = ответ


//    1.4.* Умножать число long a = 1; на 3 пока не произойдёт переполнение. В конце в консоль вывести сообщение со
//    значением до переполнения и после переполнения

    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);

        int result = 1;
        for (int i = 1; i <= a; i++) {
            result *= i;
        }
        System.out.println("1.1: " + result);
    }

}

