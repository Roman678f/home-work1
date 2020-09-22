package homework3;

public class CalculatorWithMathCopy {

    public double div(double a, double b) {
        return a / b;
    }

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

        return Math.pow(a, power);
    }

    public double module(double a) {
        return Math.abs(a);
    }

    public double sqrt(double a) {
        return Math.sqrt(a);
    }
}
