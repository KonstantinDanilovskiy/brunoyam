package lesson13;

import java.util.Map;

public class Const implements Expression {

    private String value;

    public Const(String value) {
        this.value = value;
    }

    @Override
    public int calculate(Map<String, Integer> map) {
        return map.get(value);
    }

}
