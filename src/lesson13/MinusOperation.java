package lesson13;

import java.util.Map;

public class MinusOperation extends Operation {

    public MinusOperation(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int calculate(Map<String, Integer> map) {
        return getLeft().calculate(map) - getRight().calculate(map);
    }

}
