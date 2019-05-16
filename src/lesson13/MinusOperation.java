package lesson13;

public class MinusOperation extends Operation {

    public MinusOperation(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int calculate() {
        return getLeft().calculate() - getRight().calculate();
    }

}
