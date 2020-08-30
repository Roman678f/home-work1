package homework1;
public class HomeWork1_1 {
    //    1. Побитовые операции:
//            1.1. http://developer.alexanderklimov.ru/android/java/bitwise.php
//            1.2 Использовать ВСЕ возможные побитовые операции с числами 42 и 15.
//            1.3 Использовать ВСЕ возможные побитовые операции с числами -42 и -15.
//            1.4 В комментариях к каждой операции написать двоичный код каждого числа и результата операции.
    //128  64  32  16       8  4  2  1
    //-128    ...1000 0000         127 ...0111 1111
    //Integer.toBinaryString()
    public static void main(String[] args) {
        byte a = 42;                               //0010 1010
        byte b = 15;                               //0000 1111

        System.out.println("&       "+(a & b));    //0000 1010      (и)
        System.out.println("|       "+(a | b));    //0010 1111      (или)
        System.out.println("^       "+(a ^ b));    //0010 0101      (или исключающее)
        System.out.println("~a      "+~a);         //1101 0101      (инвертирует)
        System.out.println("~b      "+~b);         //1111 0000
        System.out.println("a<<2    "+(a<<2));     //1010 1000      (сдвиг)
        System.out.println("b<<2    "+(b<<2));     //0011 1100
        System.out.println("a>>2    "+(a>>2));     //0000 1010
        System.out.println("b>>2    "+(b>>2));     //0000 0011
        System.out.println("a>>>5   "+(a>>>5));    //0000 0001
        System.out.println("b>>>5   "+(b>>>5));    //0000 0000

        System.out.println("  ");
        byte c = -42;                              //1101 0110
        byte d = -15;                              //1111 0001

        System.out.println("&       "+(c & d));    //1101 0000      (и)
        System.out.println("|       "+(c | d));    //1111 0111      (или)
        System.out.println("^       "+(c ^ d));    //0010 0111      (или исключающее)
        System.out.println("~c      "+~c);         //0010 1001      (инвертирует)
        System.out.println("~d      "+~d);         //0000 1110
        System.out.println("c<<2    "+(c<<2));     //0101 1000      (сдвиг)
        System.out.println("d<<2    "+(d<<2));     //1100 0100
        System.out.println("c>>2    "+(c>>2));     //1111 0101  ?
        System.out.println("d>>2    "+(d>>2));     //1111 1100
        System.out.println("c>>>5   "+(c>>>5));    // ?
        System.out.println("d>>>5   "+(d>>>5));    // ?

    }
}
