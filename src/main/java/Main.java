import calculator.Calculator;
import calculator.Formula;
import calculator.Ints;
import calculator.Operation;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println(calc.newFormula()
        .addOperand(10)
        .addOperand(15)
        .calculate(Operation.MULT)
        .result());


        Ints calc_int = new IntsCalculator();
        System.out.println(calc_int.mult(10, 15));
        System.out.println(calc_int.pow(3, 2));
        System.out.println(calc_int.sum(123, 345));
    }
}
