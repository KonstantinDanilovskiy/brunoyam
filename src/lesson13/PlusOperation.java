package lesson13;

public class PlusOperation extends Operation {

    public PlusOperation(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int calculate() {
        return getLeft().calculate() + getRight().calculate();
    }
}
