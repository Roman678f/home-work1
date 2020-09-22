package homework3;

public class CalculatorWithOperator {
    //        деление     division
//        умножение   multiplication
//        вычитание   subtraction
//        сложение    addition
//        степень     power
//        модуль      module
    public double div(double a, double b) { return a / b; }

    public double multi(double a, double b) {
        return a * b;
    }

    public double sub(double a, double b) {
        return a - b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public double pow(double a, int power) {
        double powResult = 1;
        for (int i = 0; i < power; i++) {
            powResult *= a;
        }
        return powResult;
    }

    public double module(double a) {
        return (a >= 0.0) ? a : a * -1;
    }
    public double sqrt(double a){
        return Math.sqrt(a);
    }

}
