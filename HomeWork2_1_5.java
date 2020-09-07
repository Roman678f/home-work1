package homework2;

public class HomeWork2_1_5 {
    //    1.5. Вывести таблицу умножения в консоль. В консоли должно получиться также как и на картинке (динозаврика
//    рисовать не надо): https://www.dropbox.com/s/ibakfuppvy2w32g/multiplication_table.jpeg?dl=0  //табуляцию
    public static void main(String[] args) {

        for (int i = 1; i < 11; i++) {
            System.out.println();
            for (int j = 2; j < 6; j++) {
                System.out.printf("%d * %2d = %2d    ", j, i, j * i);

            }
        }
        System.out.println();

        for (int i = 1; i < 11; i++) {
            System.out.println();
            for (int j = 6; j < 10; j++) {
                System.out.printf("%d * %2d = %2d    ", j, i, j * i);

            }

        }
    }
}