package homework3;

public class CalculatorWithCounter {
    //    Создать класс CalculatorWithCounter, все методы в данном классе НЕ статические. У данного класса должно быть
//    три конструктора (или один если сможете, это ещё не изучено https://refactoring.guru/ru/design-patterns/decorator)
//             один принимающий в себя CalculatorWithOperator, второй CalculatorWithMathCopy,
//             третий CalculatorWithMathExtends. Данные конструкторы должны сохранять переданные калькуляторы в
//             приватные поля класса для дальнейшего их использования. Он также имеет 7 методов как и другие
//             калькуляторы + 1 метод getCountOperation() который должен вернуть значение внутреннего счётчика.
//            В реализации методов должен быть вызван один из объектов переданный в констуктор при создании
//            объекта CalculatorWithCounter, и вызвать соответсвующий метод у них. К примеру. Если вызывают метод plus
//            у CalculatorWithCounter то он должен вызвать метод plus у объекта CalculatorWithOperator или у объекта
//            CalculatorWithMathCopy или у объекта  CalculatorWithMathExtends (смотря что передали в конструктор) и
////    увеличить значение внутреннего счётчика операций.

    private final CalculatorWithOperator calc1;
    private final CalculatorWithMathCopy calc2;
    private final CalculatorWithMathExtends calc3;
    private long counter=0;

    public CalculatorWithCounter(CalculatorWithOperator x) {
        this.calc1 = x;
        this.calc2 = null;
        this.calc3 = null;
    }

    public CalculatorWithCounter(CalculatorWithMathCopy x) {
        this.calc1 = null;
        this.calc2 = x;
        this.calc3 = null;
    }

    public CalculatorWithCounter(CalculatorWithMathExtends x) {
        this.calc1 = null;
        this.calc2 = null;
        this.calc3 = x;
    }

    public double div(double a, double b) {
        this.counter++;
        if(this.calc1 !=null){return calc1.div(a,b);}
        else if (this.calc2 !=null){return this.calc2.div(a,b);}
        else {return this.calc3.div(a,b);}
    }

    public double multi(double a, double b) {
        this.counter++;
        if(this.calc1 !=null){return calc1.multi(a,b);}
        else if (this.calc2 !=null){return this.calc2.multi(a,b);}
        else {return this.calc3.multi(a,b);}
    }

    public double sub(double a, double b) {
        this.counter++;
        if(this.calc1 !=null){return calc1.sub(a,b);}
        else if (this.calc2 !=null){return this.calc2.sub(a,b);}
        else {return this.calc3.sub(a,b);}

    }

    public double add(double a, double b) {
        this.counter++;
        if(this.calc1 !=null){return calc1.add(a,b);}
        else if (this.calc2 !=null){return this.calc2.add(a,b);}
        else {return this.calc3.add(a,b);}
    }

    public double pow(double a, int power) {
        this.counter++;
        if(this.calc1 !=null){return calc1.pow(a,power);}
        else if (this.calc2 !=null){return this.calc2.pow(a,power);}
        else {return this.calc3.pow(a,power);}
    }

    public double module(double a) {
        this.counter++;
        if(this.calc1 !=null){return calc1.module(a);}
        else if (this.calc2 !=null){return this.calc2.module(a);}
        else {return this.calc3.module(a);}
    }
    public double sqrt(double a) {
        this.counter++;
        if(this.calc1 !=null){return calc1.sqrt(a);}
        else if (this.calc2 !=null){return this.calc2.sqrt(a);}
        else {return this.calc3.sqrt(a);}

        public int getCountOperation() {    //должен вернуть значение внутреннего счётчика.
        return
    }
}
