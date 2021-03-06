package homework1;

import java.util.Objects;
import java.util.Scanner;

public class HomeWork1_5 {
    //    5. Разбираемся с операторами ветвления. Используя статью https://metanit.com/java/tutorial/2.9.php запросить у
//       пользователя его имя. В данном задании у вас должно получиться 3 класса.
//    Что в итоге надо сделать (общее условие):
//            1. Если имя будет равно имени Вася тогда в консоль должно вывести сообщение "Привет!" на одной строке, а
//               на второй "Я тебя так долго ждал".
//            2. Если имя будет равно имени "Анастасия" тогда в консоль должно вывести сообщение "Я тебя так долго ждал".
//            3. В случае если это будет другое имя то вывести сообщение "Добрый день, а вы кто?".
//    Как это сделать:
//            5.1 Написать в отдельном классе в отдельном main код который будет выполнять общее условие при помощи if
//            5.2 Написать в отдельном классе в отдельном main код который будет выполнять общее условие при помощи if else if
//            5.3 Написать в отдельном классе в отдельном main код который будет выполнять общее условие при помощи switch
//    ВНИМАНИЕ! В примерах if и else if для сравнения имён использовать код вида Objects.equals("Имя1", "Имя2").
//                                                                 Метод equals сравнивает два объекта на равенство:

//            Для получения ввода с консоли в классе System определен объект in. Однако непосредственно через объект System.in
//    не очень удобно работать, поэтому, как правило, используют класс Scanner, который, в свою очередь использует System.in.
//            Так как класс Scanner находится в пакете java.util, то мы вначале его импортируем с помощью инструкции import java.util.Scanner.
//    Для создания самого объекта Scanner в его конструктор передается объект System.in. После этого мы можем получать вводимые значения.
//    Например, в данном случае вначале выводим приглашение к вводу и затем получаем вводимое число в переменную num.
//    Чтобы получить введенное число, используется метод in.nextInt();, который возвращает введенное с клавиатуры целочисленное значение.
//    Пример работы программы:
//            Класс Scanner имеет еще ряд методов, которые позволяют получить введенные пользователем значения:
//    next(): считывает введенную строку до первого пробела
//    nextLine(): считывает всю введенную строку
//    nextInt(): считывает введенное число int
//    nextDouble(): считывает введенное число double
//    nextBoolean(): считывает значение boolean
//    nextByte(): считывает введенное число byte
//    nextFloat(): считывает введенное число float
//    nextShort(): считывает введенное число short
//    То есть для ввода значений каждого примитивного типа в классе Scanner определен свой метод.

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя:");
        String name = in.nextLine();

        switch (isVasia(name)) {
            case ("Вася"):
                System.out.println("Привет");
                System.out.println("Я тебя так долго ждал");
                break;
            case ("Анастасия"):
                System.out.println("Я тебя так долго ждал");
                break;
            default:
                System.out.println("а вы кто?");
        }
    }

    static String isVasia(String name) {
        if (Objects.equals(name, "Вася")) {
            return "Вася";
        } else if (Objects.equals(name, "Анастасия"))
            return "Анастасия";
        else return "jnkj";
    }

}
