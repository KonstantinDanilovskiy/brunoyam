package lesson13;

public class MultOperation extends Operation {

    public MultOperation(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int calculate() {
        return getLeft().calculate() * getRight().calculate();
    }

}
