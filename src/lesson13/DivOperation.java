package lesson13;

public class DivOperation extends Operation {

    public DivOperation(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int calculate() {
        return getLeft().calculate() / getRight().calculate();
    }

}
