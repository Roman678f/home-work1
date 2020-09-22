package homework3;

public class Main1 {
    public static void main(String[] args) {
        CalculatorWithOperator value = new CalculatorWithOperator();
//        4.1+15*7+(28/5)^2
//        деление     division
//        умножение   multiplication
//        вычитание   subtraction
//        сложение    addition
//        степень     power
//        модуль      module
        double a = 4.1;
        double b = 15;
        double c = 7;
        double d = 28;
        double e = 5;
        int f = 2;

        double result = value.add(value.add(a, value.multi(b, c)), value.pow(value.div(d, e), f));   //не нравится
        System.out.println(result);
        System.out.println(value.div(result, 0));    //Infinity  на ноль делить же нельзя
        System.out.println(value.div(result, 0.0d));  // Infinity  на ноль делить же нельзя

        CalculatorWithMathCopy value2 = new CalculatorWithMathCopy();
        double result2 = value2.add(value2.add(a, value2.multi(b, c)), value2.pow(value2.div(d, e), f));
        System.out.println(result2);
        System.out.println(value2.div(result2, 0));
        System.out.println(value2.div(result2, 0.0d));

        CalculatorWithMathExtends value3 = new CalculatorWithMathExtends();
        double result3 = value3.add(value3.add(a, value3.multi(b, c)), value3.pow(value3.div(d, e), f));
        System.out.println(result3);
        System.out.println(value3.div(result3, 0));
        System.out.println(value3.div(result3, 0.0d));
    }

}
