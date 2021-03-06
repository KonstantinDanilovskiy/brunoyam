package lesson13;

import java.util.Map;

public abstract class Operation implements Expression {
    private Expression left;
    private Expression right;

    public Operation(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    public Expression getLeft() {
        return left;
    }

    public Expression getRight() {
        return right;
    }

    @Override
    public abstract int calculate(Map<String, Integer> map);
}
