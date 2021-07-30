import calculator.Calculator;
import calculator.Ints;
import calculator.Operation;

public class IntsCalculator implements Ints {
    protected final Calculator target;

    public IntsCalculator() {
        target = new Calculator();
    }

    @Override
    public int sum(int arg0, int arg1) {
        return (int) target
                .newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(Operation.SUM)
                .result();
    }

    @Override
    public int mult(int arg0, int arg1) {
        return (int) target
                .newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(Operation.MULT)
                .result();
    }

    @Override
    public int pow(int arg0, int arg1) {
        return (int) target
                .newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(Operation.POW)
                .result();
    }
}
