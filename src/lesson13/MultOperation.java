package lesson13;

import java.util.Map;

public class MultOperation extends Operation {

    public MultOperation(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int calculate(Map<String, Integer> map) {
        return getLeft().calculate(map) * getRight().calculate(map);
    }

}
