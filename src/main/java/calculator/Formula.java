package calculator;

public class Formula {
    protected Double a;
    protected Double b;
    protected Double result;

    protected Formula() {
    }

    public Formula addOperand(double operand){
        if (a == null ){
            a = operand;
        }else if (b == null){
            b = operand;
        }else {
            throw new IllegalStateException("Formula is full of operands");
        }
        return this;
    }

    public Formula calculate(Operation operation){
        if (a == null || b == null)
            throw new IllegalStateException("Not enough operands!");
        switch (operation){
            case SUM:
                result = a + b;
                break;
            case SUB:
                result = a - b;
                break;
            case MULT:
                result = a * b;
                break;
            case DIV:
                if (b != 0){
                    result = a / b;
                }else throw new ArithmeticException("Divide by zero");
                break;
            case POW:
                result = Math.pow(a, b);
                break;
        }
        return this;
    }
    public double result(){
        if (result == null)
            throw new IllegalStateException("Formula is not computed!");
        return result;
    }
}
