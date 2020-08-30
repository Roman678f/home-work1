package homework1;

public class HomeWork1_4 {
    //    4.* Создать СТАТИЧЕСКИЙ метод sleepIn рядом с методом main. (Взято с https://codingbat.com/prob/p187868).
//            4.1 Данный метод будет принимает два параметра
//            4.2 Будет отвечать на вопрос спать ли дальше (возвращать true либо false).
//            4.3 Первый параметр boolean weekday обозначает рабочий день
//            4.4 Второй параметр boolean vacation обозначает отпуск.
//            4.5 Если у нас отпуск или не рабочий день то мы можем спать дальше
//            4.6 На основании ответа от метода sleepIn вывести сообщение можем спать дальше или пора идти на работу
    public static void main(String[] args) {
        boolean weekday = true;
        boolean vacation = true;

        if (isSleepIn(weekday, vacation)) {
            System.out.println("пора идти на работу");
        } else System.out.println("можем спать дальше");

    }

    static boolean isSleepIn(boolean weekday, boolean vacation) {
        if (weekday && !vacation) {
            return true;
        }
        return false;
    }
}

