package homework2;

public class HomeWork2_1_2 {
//    1.2. Все цифры из числа введенного через аргумент к исполняемой программе перемножить между собой и вывести
//    ход вычислений в консоль. Пример: Ввели 181232375, 1 * 8 * 1 * 2 * …. * 5 = ответ

    public static void main(String[] args) {
        int i = Integer.parseInt(args[0]);
        int result = 1;
        for (; i > 0; ) {
            int b = i % 10;
            result *= b;
            if (i > 10) {
                System.out.print(b + " * ");
            } else {
                System.out.print(b);
            }
            i /= 10;
        }

        System.out.print(" = " + result);

    }
}
